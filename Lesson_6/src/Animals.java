public class Animals {
    private int minRun;
    private int maxRun;
    private double minSwim;
    private double maxSwim;
    private double minBarrier;
    private double maxBarrier;

    public Animals(int _minRun,int _maxRun,double _minSwim,double _maxSwim, double _minBarrier, double _maxBarrier){
        this.minRun = _minRun;
        this.maxRun = _maxRun;
        this.minSwim = _minSwim;
        this.maxSwim = _maxSwim;
        this.minBarrier = _minBarrier;
        this.maxBarrier = _maxBarrier;
    }

    public void Run(int runDistance){
        if(runDistance >= minRun && runDistance <= maxRun){
            System.out.println(runDistance + " meters run - no problem!");
        }else{
            System.out.println("This animal can't run the " + runDistance + " meter distance.");
        }
    }

    public void Swim(double swimDistance){
        if(swimDistance >= minSwim && swimDistance <= maxSwim){
            System.out.println("Swim: true.");
        }else{
            System.out.println("It can't swim that much.");
        }
    }

    public void Barrier(double height){
        if(height >= minBarrier && height <= maxBarrier){
            System.out.println("This animal can jump over the barrier that is " + height + " meters high.");
        }else {
            System.out.println("Impossible to jump over this barrier.");
        }
    }
}

