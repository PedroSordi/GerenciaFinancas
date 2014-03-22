package br.com.gerenciafinancas.tabAdapter;

import br.com.gerenciafinancas.Configuracoes;
import br.com.gerenciafinancas.ContasPagar;
import br.com.gerenciafinancas.Faturamento;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new ContasPagar();
		case 1:
			return new Faturamento();
		case 2:
			return new Configuracoes();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
