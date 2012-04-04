package br.com.gjmoretti;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MenuJava extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override    
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	// Mostrar o menu
    	
    	// Para menus XML:
    	// MenuInflater menuInflater = getMenuInflater();
    	// menuInflater.inflate(R.menu.itensmenu, menu);
    	// return true;
    	
    	// Para menus Java
    	
    	boolean result = super.onCreateOptionsMenu(menu); // ?
    	super.onCreateOptionsMenu(menu); // ?
    	
    	// Sem o �cone:
    	// menu.add(0, 1, 0, "Gravar");
    	
    	menu.add(0, 1, 0, "Gravar").setIcon(R.drawable.save);
    	menu.add(0, 2, 0, "Editar").setIcon(R.drawable.edit);
    	menu.add(0, 3, 0, "Excluir").setIcon(R.drawable.delete);
    	
    	// Cria��o de sub-menus:
    	SubMenu utilitario = menu.addSubMenu("Utilit�rios");
    	utilitario.add(0, 4, 0, "Pesquisa");
    	utilitario.add(0, 5, 0, "Alterar");
    	
    	return result;
    }
    
    @Override    
    public boolean onOptionsItemSelected(MenuItem itemMenu)
    {
    	// A��o ao clicar em um item de Menu:
    	
    	switch (itemMenu.getItemId()) {
		   case 1: ExibirMensagem("Gravar", "Voc� clicou em Gravar"); break;		   
		   case 2: ExibirMensagem("Editar", "Voc� clicou em Editar"); break;
		   case 3: ExibirMensagem("Excluir", "Voc� clicou em Excluir"); break;
		   case 4: ExibirMensagem("Pesquisa", "Voc� clicou em Pesquisa"); break;
		   case 5: ExibirMensagem("Alterar", "Voc� clicou em Alterar"); break;
		}
    	
    	return super.onOptionsItemSelected(itemMenu);
    }
    
    // M�todo para mensagens din�micas:    
    public void ExibirMensagem(String pTitulo, String pMensagem)
    {
		AlertDialog.Builder Mensagem = new AlertDialog.Builder(MenuJava.this);
		Mensagem.setTitle(pTitulo);
		Mensagem.setMessage(pMensagem);
		Mensagem.setNeutralButton("OK", null);
		Mensagem.show();
    }
    
    
    
}