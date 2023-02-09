import java.io.Serializable;

public class Hocsinh implements Serializable {
    String Hoten;
    String Quequan;
    int Tuoi;

    public Hocsinh(String Hoten, String Quequan, int Tuoi){
        this.Hoten = Hoten;
        this.Quequan = Quequan;
        this.Tuoi = Tuoi;
    }
    public Hocsinh(){
    }
    public String getHoten(){
        return Hoten;
    }
    public void setHoten(String Hoten){
        this.Hoten = Hoten;
    }
    public String getQuequan(){
        return Quequan;
    }
    public void setQuequan(String Quequan){
        this.Quequan = Quequan;
    }
    public int getTuoi(){
        return Tuoi;
    }
    public void setTuoi(int Tuoi){
        this.Tuoi = Tuoi;
    }
}
