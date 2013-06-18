package com.mucuk.startupservice;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MService extends Service{

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate(){
		Log.i("onCreate", "Service onCreate");
		new ToastMessageTask().execute("Service Çalýþtý");
	}

	private class ToastMessageTask extends AsyncTask<String, String, String> {
	    String toastMessage;

	    @Override
	    protected String doInBackground(String... params) {
	        toastMessage = params[0];
	        return toastMessage;
	    }
	   
	    protected void onPostExecute(String result){
	           Toast toast = Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT);
	           toast.show();
	    }
	}

}
