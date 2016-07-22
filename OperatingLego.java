package legomindstorm;

public class OperatingLego {
	public static void main(String[] args){
		
	}
	void main(){
		init();			//初期化処理
		connectBT();	//BlueTooth接続
		while(!isGoal()){	//ゴールにつくまで処理を回す
			processCommand(); //命令を読み込んで処理する
		}
		del();		//終了処理
	}
	//初期化
	void init(){
		
	}
	// BTConnection作成
	void connectBT(){
		
	}
	
//	void startCommandProcessing(){
//		
//	}
//	void finishCommandProcessing(){
//		
//	}
	// 命令を読み込んで処理する
	void Processcommand(){
		
	}
	//左の回転数を上げる
	void increaseLeftWheelSpeed(){
		
	}
	//左の回転数を下げる
	void decreaseLeftWheelSpeed(){
		
	}
	//右の回転数を上げる
	void increaseRightWheelSpeed(){
		
	}
	//右の回転数を下げる
	void decreaseRightWheelSpeed(){
		
	}
	//立ち入り禁止エリアを出る
	void avoidKeepOutArea(){
		
	}
	//avoidKeepOutArea後の車を止める
	void stopCar(){
		
	}
	//avoidKeepOutArea後の車の再開
	void RunCar(){
		
	}
	//ゴールしてるかどうかの判別
	boolean isGoal(){
		return null;
	}
	

	//車輪の速度を初期化する
	void initializeCarWheel(){
		
	}
	//処理を正常に終了する
	void del(){
		
	}
}
class ReceiveCommand extends Thread{
	public 
}
