package softuni.oop.solid.lab.p05_DependencyInversion.p02_Worker;

public class Manager {
    private Worker worker;

    public Manager(Worker worker) {
        this.worker = worker;
        this.worker.work();
    }
}
