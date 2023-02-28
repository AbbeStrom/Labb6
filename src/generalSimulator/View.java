package generalSimulator;

import java.util.Observer;

abstract class View implements Observer {

    EventQueue eventQueue = new EventQueue();

    abstract public void update();
}
