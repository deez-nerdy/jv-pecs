package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<Machine> machines = new ArrayList<>();

        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            machines.addAll(bulldozerProducer.get());
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            machines.addAll(excavatorProducer.get());
        } else if (type == Truck.class) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            machines.addAll(truckProducer.get());
        }
        return (List<T>) machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> list) {
        for (T machine : list) {
            machine.doWork();
        }
    }
}
