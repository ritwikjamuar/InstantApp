package ritwik.instantapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ritwik.instantapp.BaseActivity;

public class FirstActivity extends AppCompatActivity
{
	private Button mButton;

	@Override
	protected void onCreate ( Bundle savedInstanceState )
	{
		super.onCreate ( savedInstanceState );
		setContentView ( R.layout.activity_first );

		mButton = (Button) findViewById ( R.id.button );
		mButton.setOnClickListener ( new View.OnClickListener () {
			@Override
			public void onClick ( View v )
			{
				Toast.makeText ( FirstActivity.this, "Base is clicked", Toast.LENGTH_SHORT ).show ();
				startActivity ( new Intent ( FirstActivity.this, BaseActivity.class ) );
			}
		} );
	}
}