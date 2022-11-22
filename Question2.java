class Worker {   

    private String n;   
    private int WI;   
    private double w;   
    private boolean FT;

    Worker(String name, int workerId, double wage, boolean fullTime){     
        this.n = name;     
        this.WI = workerId;     
        this.w = wage;
        this.FT = fullTime;   
    }   
    
    public String getName(){     
        return this.n;   
    } 

    public void setWorkerId(int id){
         this.WI = id;   
    }   
    
    public int getWorkerId(){     
        return this.WI;   
    }   
    
    public double getWage(){     
        return this.w;   
    }   
    
    public boolean getFullTime(){     
        return this.FT;   
    }   

    public void setName(String n){     
        this.n = n;   
    }   
    public void setWage(double w){     
        this.w = w;   
    }   
    public void setFullTime(boolean f){     
        this.FT = f;   
    }    

    public void printDetails(){     
        String out="";     
        if(this.FT){       
            out=out+"The name of the worker is "+this.n + ". The worker id is "+this.WI;       
            out=out+". The wage of the worker is $"+this.w+" per hour. The employee is not full-time.\n";     
        }     
        else{       
            out=out+"The name of the worker is "+this.n + ". The worker id is "+this.WI;       
            out=out+". The wage of the worker is $"+this.w+" per hour. The employee is full-time.\n";     
        }     
        System.out.println(out);   
    } 
} 
public class Question2{   
    public static void main(String[] args)   
    {         
        Worker w1 = new Worker("John Smith", 123456, 25.40, false);     
        w1.printDetails();      
        
        Worker w2 = new Worker("Aidra Rhodes", 654321, 2500, true);     
        w2.printDetails();    
    } 
} 
 