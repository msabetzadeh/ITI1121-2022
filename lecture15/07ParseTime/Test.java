import java.io.*;
import java.util.*;

class TimeFormatException extends IllegalArgumentException {

    public TimeFormatException() {
        super();
    }

    public TimeFormatException( String msg ) {
        super( msg );
    }
}

public class Test {

  public static void parseTime( String timeString ) {
    
        StringTokenizer st = new StringTokenizer( timeString, ":", true );
    
        int h, m, s;
    
        try {
            //System.out.println(st.nextToken());
            h = Integer.parseInt( st.nextToken() );
        } catch( NumberFormatException e1 ) {
            throw new TimeFormatException( "first field is not a number");
        } catch( NoSuchElementException e2 ) {
            throw new TimeFormatException( "first separator not found" );
        }

        try {
            st.nextToken();
        } catch( NoSuchElementException e2 ) {
            throw new TimeFormatException( "first separator not found" );
        }

        try {
            m = Integer.parseInt( st.nextToken () );
        } catch( NumberFormatException e1 ) {
            throw new TimeFormatException( "second field is not a number" );
        } catch( NoSuchElementException e2 ) {
            throw new TimeFormatException( "second separator not found" );
        }
    
        try {
            st.nextToken();
        } catch( NoSuchElementException e2 ) {
            throw new TimeFormatException( "second separator not found" );
        }

        try {
            s = Integer.parseInt( st.nextToken() );
        } catch( NumberFormatException e1 ) {
            throw new TimeFormatException( "third field is not a number" );
        } catch( NoSuchElementException e2 ) {
            throw new TimeFormatException( "third field not found" );
        }
        
        if ( st.hasMoreTokens() )
            throw new TimeFormatException( "invalid suffix" );
    
        if ( (h<0) || (h>23) || (m<0) || (m>59) || (s<0) || (s>59) )
            throw new TimeFormatException( "values out of range:" + timeString );
    
        System.out.println(h+ ", "+ m + ", "+s );
    }
    
    public static void main( String[] args ) {
        parseTime("3:4:5");
    }
}