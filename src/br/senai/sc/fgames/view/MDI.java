package br.senai.sc.fgames.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class MDI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDI frame = new MDI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MDI() {
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("FGames");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.DARK_GRAY);
		menuBar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 12));
		menuBar.setBounds(0, 0, 641, 48);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastros\r\n");
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		mnNewMenu.add(mntmCliente);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnNewMenu.add(mntmFornecedor);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnNewMenu.add(mntmProduto);
		
		JMenu mnMovimentao = new JMenu("Movimenta\u00E7\u00E3o");
		mnMovimentao.setForeground(Color.WHITE);
		mnMovimentao.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		menuBar.add(mnMovimentao);
		
		JMenuItem mntmPedidoDeCompra = new JMenuItem("Pedido de compra");
		mntmPedidoDeCompra.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnMovimentao.add(mntmPedidoDeCompra);
		
		JMenuItem mntmPedidoDeVenda = new JMenuItem("Pedido de venda");
		mntmPedidoDeVenda.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnMovimentao.add(mntmPedidoDeVenda);
		
		JMenu mnEstoque = new JMenu("Estoque");
		mnEstoque.setForeground(Color.WHITE);
		mnEstoque.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		menuBar.add(mnEstoque);
		
		JMenuItem mntmConsulta = new JMenuItem("Consulta");
		mntmConsulta.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnEstoque.add(mntmConsulta);
		
		JMenuItem mntmRelatrio = new JMenuItem("Relat\u00F3rio");
		mntmRelatrio.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnEstoque.add(mntmRelatrio);
		
		JMenu mnUtililitarios = new JMenu("Utililitarios");
		mnUtililitarios.setForeground(Color.WHITE);
		mnUtililitarios.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		menuBar.add(mnUtililitarios);
		
		JMenuItem mntmUsurios = new JMenuItem("Usu\u00E1rios");
		mntmUsurios.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnUtililitarios.add(mntmUsurios);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar Senha");
		mntmAlterarSenha.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		mnUtililitarios.add(mntmAlterarSenha);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setForeground(Color.WHITE);
		mnSair.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		menuBar.add(mnSair);
	}
}
