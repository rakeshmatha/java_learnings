class Base {
    public void print() {
        System.out.println("Base");
    }

      static class Test1{
         Test1(int x){
            System.out.println("constructor called :" + x);
        }
    }

    static class Test2{
        Test1 test = new Test1(5);
        Test2(int i){
            test = new Test1(i);
        }
    }
    static class ToString{
        private double rm,de;

        ToString(ToString x){
            rm = x.rm;
            de= x.de;
        }
    }

    static class First
    {
        int i = 10;

        public First(int j)
        {
            System.out.println(i);
            this.i = j * 10;
        }
    }

    static class Second extends First
    {
        public String i;

        public Second(int j)
        {
            super(j);
            System.out.println(i);
//            this.i = j * 20;
        }
    }


    static class Person
    {
        private void who()
        {
            System.out.println("Inside private method Person(who)");
        }

        public static void whoAmI()
        {
            System.out.println("Inside static method, Person(whoAmI)");
        }

        public void whoAreYou()
        {
            who();
            System.out.println("Inside virtual method, Person(whoAreYou)");
        }
    }

    static class Kid extends Person
    {
        private void who()
        {
            System.out.println("Kid(who)");
        }

        public static void whoAmI()
        {
            System.out.println("Kid(whoAmI)");
        }

        public void whoAreYou()
        {
            who();
            System.out.println("Kid(whoAreYou)");
        }
    }
    static class One implements Runnable
    {
        public void run()
        {
            System.out.print(Thread.currentThread().getName());
        }
    }
    static class Two implements Runnable
    {
        public void run()
        {
            new One().run();
            new Thread(new One(),"gfg2").run();
            new Thread(new One(),"gfg3").start();
        }
    }
}
