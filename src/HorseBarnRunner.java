public class HorseBarnRunner
{
    public static void main (String[] args)
    {
        /* ---- TEST PART A ---- */
        System.out.println("********** TESTING PART A **********");
        HorseBarn sweetHome = new HorseBarn(7);
        sweetHome.placeHorse(new Horse("Trigger", 1340), 0);
        sweetHome.placeHorse(new Horse("Silver",1210), 2);
        sweetHome.placeHorse(new Horse("Lady", 1575), 3);
        sweetHome.placeHorse(new Horse("Patches", 1350), 5);
        sweetHome.placeHorse(new Horse("Duke", 1410), 6);

        // print out the current HorseBarn, showing which
        // stalls are occupied with Horses and which are not (null)
        System.out.println(sweetHome);

        test("Trigger", 0, sweetHome);
        test("Silver", 2, sweetHome);
        test("Lady", 3, sweetHome);
        test("Patches", 5, sweetHome);
        test("Duke", 6, sweetHome);
        test("Coco", -1, sweetHome);

        /* ---- TEST PART B ---- */
        // uncomment test code when you are ready
/*
    System.out.println("********** TESTING PART B **********");
    HorseBarn barn = new HorseBarn(7);
    barn.placeHorse(new Horse("Trigger", 1340), 0);
    barn.placeHorse(new Horse("Silver",1210), 2);
    barn.placeHorse(new Horse("Patches", 1350), 5);
    barn.placeHorse(new Horse("Duke", 1410), 6);

    System.out.println("Barn before consolidating:");
    System.out.println(barn);
    barn.consolidate();
    System.out.println("Barn after consolidating:");
    System.out.println(barn);

    test("Trigger", 0, barn);
    test("Silver", 1, barn);
    test("Patches", 2, barn);
    test("Duke", 3, barn);
    test("Coco", -1, barn);
*/
    }

    public static void test(String name, int correctIdx, HorseBarn barn)
    {
        System.out.print("Index of " + name + " should be " + correctIdx + " and is " + barn.findHorseSpace(name));
        if (barn.findHorseSpace(name) == correctIdx)
        {
            System.out.println(" -- pass");
        }
        else
        {
            System.out.println(" -- FAIL!");
        }
    }
}