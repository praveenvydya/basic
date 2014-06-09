package vydya;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import vydya.MathmaticsStub.Add;
import vydya.MathmaticsStub.AddResponse;

public class MathematicsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x = (float) 31.1;
		float y = (float) 29.9;
		
		try {
			
			MathmaticsStub s = new MathmaticsStub();
			//AddResponse add0 = new
			MathmaticsStub.Add add0 = new Add();
			
			add0.setX(x);
			add0.setY(y);
			AddResponse adR =  s.add(add0);
			float z = adR.get_return();
			System.out.println(" Response = "+z);
			
			
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
