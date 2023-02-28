package generalSimulator;

abstract public class Simulator {
    private EventQueue eventQueue;
    private State state;

    public abstract void run();
}
