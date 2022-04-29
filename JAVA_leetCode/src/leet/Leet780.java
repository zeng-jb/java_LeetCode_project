package leet;

public class Leet780 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int sx = 1, sy = 1, tx = 1, ty = 1;
		Leet780 obj = new Leet780();
		System.out.println(obj.reachingPoints(sx, sy, tx, ty));
	}

	public boolean reachingPoints1(int sx, int sy, int tx, int ty) {
        
		while(tx > 0 && ty > 0) {
			if(sx == tx && sy == ty) return true;
			
			if(tx > ty) {
				tx = tx- Math.max((tx-sx)/ty, 1) *ty;
			}else {
				ty = ty- Math.max((ty-sy)/tx, 1) *tx;
			}
		}
		return false;
    }
	
	public boolean reachingPoints(int sx, int sy, int tx, int ty) {
		if(tx<sx || ty<sy) return false;
		if((tx==sx && ty==sy) || (tx==sx && (ty-sy)%tx==0) || (ty==sy && (tx-sx)%ty==0)) return true;
		if(tx > ty) {
			return reachingPoints(sx, sy, tx%ty, ty);
		}else {
			return reachingPoints(sx, sy, tx, ty%tx);
		}
	}
}
