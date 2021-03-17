package softdev.Lab_session.Lab_4_6.Minesweeper.UIapplication;

import java.util.ArrayList;

public class Control {
    public int remainMine;
    public String Name;
    protected ArrayList<Map> mapList;

    public Control(String Name){
        this.Name=Name;
    }

    public void Showinfo(Map M){
        System.out.println("Remain Mine:"+remainMine);
    }

    public int addMap(Map M){
        mapList.add(M);
        return mapList.size();
    }

    public void LClick(){

    }
//
//    public boolean isMine(int height,int width,int index){
//        if(mapList.get(index).BlockChain)
//    }

    public void resetGame(){

    }
}
