
class sedan{
	double speed;

    
    
    void start(){
		speed = 0;
		System.out.println("Mobil sedan Dijalankan, Kecepatan : " + speed + " KM");
		
    }
	void stop(){
		speed = 0;
		System.out.println("Mobil sedan Dimatikan");
    }	
	void gas(){
		speed = speed + 10;
		System.out.println("Mobil sedan digas.Kecepatan menjadi : " + speed + " KM");
		
    }	
	void rem(){
		speed = speed / 2; 
		System.out.println("Mobil sedan direm.  Kecepatan menjadi : " + speed + " KM");
    }
	void gantiGigi(int gigi){
		double gantigigi;
		gantigigi = speed / gigi;
		speed = speed + gantigigi;
		System.out.println("Mobil sedan Ganti Gigi. Kecepatan menjadi :" + speed + " KM");
    }
}
public class Mobil {
    public static void main(String[] args) {
        //membuat objek baru
        jeep objek1 = new sedan();
        
        // mengakses dan menjalankan method
        objek1.start();
        objek1.gas();
		objek1.gantiGigi(2);
		objek1.gas();
		objek1.rem();
		objek1.stop();
    }
    
}
