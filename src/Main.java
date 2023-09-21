import com.engeto.computers.Computer;
import com.engeto.computers.Employee;

import javax.lang.model.util.AbstractElementVisitor14;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("ABC",1.2,13.3,
                true,true);
        computer.setWeight(1.2);
        Computer computer2 = new Computer("ABC",3.5);

        Computer computer3 = new Computer(true);

        System.out.println(computer.shouldUseDockingStation());

        Employee karel = new Employee("Karel", LocalDate.of(2001,9,5),computer);
        System.out.println("uzivatel : "+karel.getName() +" ma pocitac" + karel.getComputer().getModel());


        System.out.println("Vaha pocitace je: "+computer.getWeight() + "kg");
        computer.setWeight(computer.getWeight() + 1.2);
        System.out.println("Vaha pocitace je: "+computer.getWeight() + "kg");

        List<Computer> computerList = new ArrayList<>(); // List ... rozhrani
        computerList.add(computer);
        computerList.add(computer2);
        computerList.add(new Computer(false));

        Computer computer5 = computerList.get(2);
        System.out.println(computer5.isCompanyComputer());
        System.out.println(computerList);

        System.out.println("-----------------------------");
        System.out.println(computerList);
        System.out.println("------------------------------");

        int i =0;
        for(Computer comp : computerList){
            System.out.println(i + " :" +comp.getModel());
            i++;
        }

        computerList.clear();
        System.out.println("Pocitacov je v seznami:"+computerList.size());



    }
}