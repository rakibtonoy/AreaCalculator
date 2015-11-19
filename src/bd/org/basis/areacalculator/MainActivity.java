/**
 * 
 */
package bd.org.basis.areacalculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Rakib
 *
 */
public class MainActivity extends Activity implements OnClickListener
{
	private EditText etRadiusInput;
	private Button btnCalculateArea;
	private Button btnCalculatePerimeter;
	private TextView txtAreaResult;
     @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	etRadiusInput = (EditText) findViewById(R.id.etRadius);
    	btnCalculateArea = (Button) findViewById(R.id.btnCalculateArea);
    	btnCalculatePerimeter =(Button) findViewById(R.id.btnCalculatePerimeter);
    	txtAreaResult = (TextView) findViewById(R.id.txtResult);
    	
    	btnCalculateArea.setOnClickListener(this); 
    	btnCalculatePerimeter.setOnClickListener(this);
                                                    }
     
     @Override
 	public void onClick(View view) {
        String input=etRadiusInput.getText().toString();
        
        
        if (input.equals("")){
        	etRadiusInput.requestFocus();
        	
        	AlertDialog.Builder alert=new AlertDialog.Builder(this);
        	alert.setIcon(getResources().getDrawable(R.drawable.ic_launcher));
        	alert.setTitle("Error");
        	alert.setMessage("Please input a number");
        	alert.show();
                            }
         else {
        	double radius=Double.parseDouble(input);
        
 		switch (view.getId()) {
		case R.id.btnCalculateArea:
			Toast.makeText(getApplicationContext(), "Area Button Clicked",
	 				Toast.LENGTH_LONG).show();
			double area=Math.PI * radius * radius;
			txtAreaResult.setText("Area: "+area);
			break;
        case R.id.btnCalculatePerimeter:
        	Toast.makeText(getApplicationContext(), "Perimeter Button Clicked",
     				Toast.LENGTH_LONG).show();
        	double perimeter=2 * Math.PI * radius;
			txtAreaResult.setText("Area: "+perimeter);
		default:
			break;
		                      }
 	           }	
                                  }
}     

     
/*     class MyOnClickListener implements OnClickListener {
    	 @Override
    	 public void onClick(View view) {
    		 
    	 }
     }
     
/*     OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View view) {
			Toast.makeText(getApplicationContext(), "Button Clicked",
					Toast.LENGTH_LONG).show();
			
		}
	};
*/     
     
     
     
