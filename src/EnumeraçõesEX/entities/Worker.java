package EnumeraçõesEX.entities;

import EnumeraçõesEX.entitiesEnum.WorkerLevel;

import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts;
}
