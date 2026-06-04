public class SingletonHospital {
    
    private static SingletonHospital instance;
    
    private SingletonHospital(){   
    }
    
    public static SingletonHospital getInstance(){
        if(instance == null){
            instance = new SingletonHospital();
        }
        return instance;
    }
}
