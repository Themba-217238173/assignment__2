package za.ac.cput.assignment_2;
import java.util.Collection;
import java.util.*;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CollectionModelTest {
    Collection<String> Module = new ArrayList<>();
    @Test
    void add()
    {

        {

            Module.add("Application Development");
            System.out.println("Module Name : "  + Module);
        }
    }

    @Test
    void remove()
    {
        //Collection<String> Module = new ArrayList<>();
        {

            Module.add("Application Development");
            Module.add("Multimedia");
            Module.add("Commnet");
            Module.remove("Multimedia");
            System.out.println("Module Name : "  + Module);
        }
    }

    @Test
    void search()
    {

        {

            Module.add("Application Development");
            Module.add("Multimedia");
            Module.add("Commnet");

        }
        assertTrue(Module.contains("Multimedia"));
        System.out.println("Module Found : "  +Module.contains("Multimedia"));
    }
}