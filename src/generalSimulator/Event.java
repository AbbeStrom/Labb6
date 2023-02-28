package generalSimulator;

abstract public class Event {
    private float executionTime;
    private EventQueue eventQueue;
    private State state;

    public abstract void executeEvent();

    public State getState() {
        return state;
    }

    public float getExecutionTime() {
        return executionTime;
    }
}
