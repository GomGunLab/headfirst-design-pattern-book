package Memento;

public class Originator {
    private String state;

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    void restore(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public class Memento {
        private String state;

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }
    }
}
