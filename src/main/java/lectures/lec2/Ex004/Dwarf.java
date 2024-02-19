package lectures.lec2.Ex004;

import lectures.lec2.Ex003.Druid;

public class Dwarf extends Druid {

    public Dwarf(String name, int hp) {
        super();
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}