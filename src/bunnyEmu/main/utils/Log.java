package bunnyEmu.main.utils;

import bunnyEmu.main.ServerApplet;
import bunnyEmu.main.ServerWindow;

/**
 * A nice logging class, makes logging easier
 *
 * @author Marijn
 */
public class Log {
    
    public static final int NONE = 0;
    public static final int ERROR = 1;
    public static final int INFO = 2;
    public static final int DEBUG = 3;
    
    private static int _level = 1;
    
    public static void log(String message){
         log(_level, message);
    }
    
    public static void log(byte message){
        log(_level, message);
    }
    
    public static void log(int level, byte message){
    	log(level, String.valueOf(message));
    }
    
    public static void log(short message){
        log(_level, message);
    }
    
    public static void log(int level, short message){
    	log(level, String.valueOf(message));
    }
    
     public static void log(int message){
        log(_level, message);
    }
    
    public static void log(int level, int message){
        log(level, String.valueOf(message));
    }
    
    public static void log(long message){
        log(_level, String.valueOf(message));
    }
    
    public static void log(int level, String message){
    	if(level <= _level){
    		System.out.println(message);
    		ServerWindow.appendOut(message);
    	} if(ServerApplet.debugLabel != null){
    		ServerApplet.debugLabel.setText(ServerApplet.debugLabel.getText() + "\n" + message);
    	}
    	
    }
    
    public static void setlevel(int level){
        _level = level;
        log(DEBUG, "Logger level changed to " + level);
    }
}
