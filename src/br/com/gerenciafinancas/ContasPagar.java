package br.com.gerenciafinancas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ContasPagar extends Fragment {
	View rootView;
	Button btNovaConta;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.contas_pagar, container,
				false);
		registrarAcaoBotaoNovaConta();
		return rootView;
	}
	
	public void registrarAcaoBotaoNovaConta(){
		btNovaConta = (Button) rootView.findViewById(R.id.btNovaConta);
		
		btNovaConta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				novaConta(v);
			}
		});
	}

	public void novaConta(View v) {
		Intent intent = new Intent(v.getContext(), NovaConta.class);
		startActivity(intent);
	}
}
