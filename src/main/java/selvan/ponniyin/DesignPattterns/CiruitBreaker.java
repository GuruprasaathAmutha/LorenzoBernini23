package selvan.ponniyin.DesignPattterns;

public class CiruitBreaker {

    private int failureThreshold = 3;
    private int failureCount = 0;
    private long retryTimePeriod = 5000; // 5 seconds
    private long lastFailureTime = 0;
    private State state = State.CLOSED;

    enum State {
        CLOSED, OPEN, HALF_OPEN
    }

    public String call(Service service) {
        long currentTime = System.currentTimeMillis();

        if (state == State.OPEN) {
            if (currentTime - lastFailureTime > retryTimePeriod) {
                state = State.HALF_OPEN;
            } else {
                return "Circuit is OPEN. Call blocked.";
            }
        }

        try {
            String response = service.call();
            reset();
            return response;
        } catch (Exception e) {
            failureCount++;
            lastFailureTime = currentTime;
            if (failureCount >= failureThreshold) {
                state = State.OPEN;
            }
            return "Service failed: " + e.getMessage();
        }
    }

    private void reset() {
        failureCount = 0;
        state = State.CLOSED;
    }
}
