/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo.hbezerra
 */
public class TelaInicial extends javax.swing.JFrame {

    static String NaipeFunction(int NaipeNumeroJogador) {
        String Naipe;
        switch (NaipeNumeroJogador) {

            case 0:
                Naipe = "♠";
                break;
            case 1:
                Naipe = "♣";
                break;
            case 2:
                Naipe = "♥";
                break;
            default:
                Naipe = "♦";
                break;

        }
        return Naipe;
    }

    static ImageIcon RetornaCarta(String CartaTeste) {

        ImageIcon CARTA = new ImageIcon();
        switch (CartaTeste) {

            //Ouros
            case "1♦":
                CARTA = new ImageIcon("Images/As_Ouros.png");
                break;
            case "2♦":
                CARTA = new ImageIcon("Images/2_Ouros.png");
                break;
            case "3♦":
                CARTA = new ImageIcon("Images/3_Ouros.png");
                break;
            case "4♦":
                CARTA = new ImageIcon("Images/4_Ouros.png");
                break;
            case "5♦":
                CARTA = new ImageIcon("Images/5_Ouros.png");
                break;
            case "6♦":
                CARTA = new ImageIcon("Images/6_Ouros.png");
                break;
            case "7♦":
                CARTA = new ImageIcon("Images/7_Ouros.png");
                break;
            case "8♦":
                CARTA = new ImageIcon("Images/8_Ouros.png");
                break;
            case "9♦":
                CARTA = new ImageIcon("Images/9_Ouros.png");
                break;
            case "10♦":
                CARTA = new ImageIcon("Images/10_Ouros.png");
                break;
            case "10♦VALETE":
                CARTA = new ImageIcon("Images/Valete_Ouros.png");
                break;
            case "10♦DAMA":
                CARTA = new ImageIcon("Images/Dama_Ouros.png");
                break;
            case "10♦REI":
                CARTA = new ImageIcon("Images/Rei_Ouros.png");
                break;

            //Espadas   
            case "1♠":
                CARTA = new ImageIcon("Images/As_Espadas.png");
                break;
            case "2♠":
                CARTA = new ImageIcon("Images/2_Espadas.png");
                break;
            case "3♠":
                CARTA = new ImageIcon("Images/3_Espadas.png");
                break;
            case "4♠":
                CARTA = new ImageIcon("Images/4_Espadas.png");
                break;
            case "5♠":
                CARTA = new ImageIcon("Images/5_Espadas.png");
                break;
            case "6♠":
                CARTA = new ImageIcon("Images/6_Espadas.png");
                break;
            case "7♠":
                CARTA = new ImageIcon("Images/7_Espadas.png");
                break;
            case "8♠":
                CARTA = new ImageIcon("Images/8_Espadas.png");
                break;
            case "9♠":
                CARTA = new ImageIcon("Images/9_Espadas.png");
                break;
            case "10♠":
                CARTA = new ImageIcon("Images/10_Espadas.png");
                break;
            case "10♠VALETE":
                CARTA = new ImageIcon("Images/Valete_Espadas.png");
                break;
            case "10♠DAMA":
                CARTA = new ImageIcon("Images/Dama_Espadas.png");
                break;
            case "10♠REI":
                CARTA = new ImageIcon("Images/Rei_Espadas.png");
                break;

            //Copas
            case "1♥":
                CARTA = new ImageIcon("Images/As_Copas.png");
                break;
            case "2♥":
                CARTA = new ImageIcon("Images/2_Copas.png");
                break;
            case "3♥":
                CARTA = new ImageIcon("Images/3_Copas.png");
                break;
            case "4♥":
                CARTA = new ImageIcon("Images/4_Copas.png");
                break;
            case "5♥":
                CARTA = new ImageIcon("Images/5_Copas.png");
                break;
            case "6♥":
                CARTA = new ImageIcon("Images/6_Copas.png");
                break;
            case "7♥":
                CARTA = new ImageIcon("Images/7_Copas.png");
                break;
            case "8♥":
                CARTA = new ImageIcon("Images/8_Copas.png");
                break;
            case "9♥":
                CARTA = new ImageIcon("Images/9_Copas.png");
                break;
            case "10♥":
                CARTA = new ImageIcon("Images/9_Copas.png");
                break;
            case "10♥VALETE":
                CARTA = new ImageIcon("Images/Valete_Copas.png");
                break;
            case "10♥DAMA":
                CARTA = new ImageIcon("Images/Dama_Copas.png");
                break;
            case "10♥REI":
                CARTA = new ImageIcon("Images/Rei_Copas.png");
                break;

            //Paus
            case "1♣":
                CARTA = new ImageIcon("Images/As_Paus.png");
                break;
            case "2♣":
                CARTA = new ImageIcon("Images/2_Paus.png");
                break;
            case "3♣":
                CARTA = new ImageIcon("Images/3_Paus.png");
                break;
            case "4♣":
                CARTA = new ImageIcon("Images/4_Paus.png");
                break;
            case "5♣":
                CARTA = new ImageIcon("Images/5_Paus.png");
                break;
            case "6♣":
                CARTA = new ImageIcon("Images/6_Paus.png");
                break;
            case "7♣":
                CARTA = new ImageIcon("Images/7_Paus.png");
                break;
            case "8♣":
                CARTA = new ImageIcon("Images/8_Paus.png");
                break;
            case "9♣":
                CARTA = new ImageIcon("Images/9_Paus.png");
                break;
            case "10♣":
                CARTA = new ImageIcon("Images/10_Paus.png");
                break;
            case "10♣VALETE":
                CARTA = new ImageIcon("Images/Valete_Paus.png");
                break;
            case "10♣DAMA":
                CARTA = new ImageIcon("Images/Dama_Paus.png");
                break;
            case "10♣REI":
                CARTA = new ImageIcon("Images/Rei_Paus.png");
                break;
            default:
                CARTA = new ImageIcon("Images/Teste.png");
                break;
        }
        return CARTA;

    }

    static String baralho[] = new String[5];
    static String baralhoMesa[] = new String[5];

    static boolean cartavalida = false;
    static int i = 0;

    static int dialogButton = 0; //BOTAO JOGAR NOVAMENTE OU NAO

    static int dialogResult = 0; // RESULTADO DO BOTAO
    static int cartasjogador = 2, cartasmaquina = 2;
    static String Jogador1, JogadaUser = "";
    static int rodada = 0;

    static int contadorMaquina = 0;
    static int contadorMesa = 0;

    static int ValorAposta = 20;

    static int maquinapedeoutra = 0;
    static int NaipeNumeroJogador = 0;
    static int NaipeNumeroMaquina = 0;

    static String Naipe = NaipeFunction(NaipeNumeroJogador);

    static int MaoMesaoutracarta = 0;

    static boolean fimJogo = true;

    static boolean iniciarjogo = false;

    static boolean outracarta = false;

    static boolean nomejogadorvalido = false;

    static Random mesa = new Random();

    static int MaoMesa = 0, MaoJogador = 0, MaoMesaNumero = 0, MaoJogadorNumero = 0;

    ImageIcon carta1 = new ImageIcon("Images/Carta_Virada.png");
    ImageIcon carta2 = new ImageIcon("Images/Carta_Virada.png");
    ImageIcon carta3 = new ImageIcon("Images/Carta_Virada.png");
    ImageIcon carta4 = new ImageIcon("Images/Carta_Virada.png");
    ImageIcon carta5 = new ImageIcon("Images/Carta_Virada.png");
    ImageIcon PedeOutraCarta;

    static ImageIcon Vegas_Baby_Gif = new ImageIcon("Images/Vegas_Baby.gif");

    static boolean CartaRepetida(String baralho[], int MaoJogador, String Naipe) {

        for (i = 0; i < baralho.length; i++) {
            if (baralho[i].equals(MaoJogador + Naipe)) {
                cartavalida = !cartavalida;
                System.out.println("A carta " + MaoJogador + Naipe + " Ja saiu");
            }

        }
        return cartavalida;
    }

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OutraCarta = new javax.swing.JButton();
        PararJogada = new javax.swing.JButton();
        jLabel4Resultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoIniciar = new javax.swing.JButton();
        ReiniciarJogo = new javax.swing.JButton();
        ImagemCarta1 = new javax.swing.JLabel();
        ImagemCarta2 = new javax.swing.JLabel();
        ImagemCarta3 = new javax.swing.JLabel();
        ImagemCarta4 = new javax.swing.JLabel();
        ImagemCarta5 = new javax.swing.JLabel();
        Vegas = new javax.swing.JLabel();
        NomeJogador1 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DisplayAposta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 192, 156));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carta 1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 280, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carta 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 280, 50, 17);

        OutraCarta.setText("Outra Carta");
        OutraCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutraCartaActionPerformed(evt);
            }
        });
        getContentPane().add(OutraCarta);
        OutraCarta.setBounds(610, 520, 100, 30);

        PararJogada.setText("Parar");
        PararJogada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararJogadaActionPerformed(evt);
            }
        });
        getContentPane().add(PararJogada);
        PararJogada.setBounds(610, 470, 100, 30);

        jLabel4Resultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4Resultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4Resultado.setText("Carta 3");
        getContentPane().add(jLabel4Resultado);
        jLabel4Resultado.setBounds(380, 280, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Carta 4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 280, 50, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carta 5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(680, 280, 50, 17);

        BotaoIniciar.setText("Iniciar Jogo");
        BotaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoIniciar);
        BotaoIniciar.setBounds(70, 470, 110, 30);

        ReiniciarJogo.setText("Reiniciar Jogo");
        ReiniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarJogoActionPerformed(evt);
            }
        });
        getContentPane().add(ReiniciarJogo);
        ReiniciarJogo.setBounds(660, 40, 120, 30);
        getContentPane().add(ImagemCarta1);
        ImagemCarta1.setBounds(50, 300, 120, 150);
        getContentPane().add(ImagemCarta2);
        ImagemCarta2.setBounds(200, 300, 120, 150);
        getContentPane().add(ImagemCarta3);
        ImagemCarta3.setBounds(350, 300, 120, 150);
        getContentPane().add(ImagemCarta4);
        ImagemCarta4.setBounds(500, 300, 120, 150);
        getContentPane().add(ImagemCarta5);
        ImagemCarta5.setBounds(650, 300, 120, 150);
        getContentPane().add(Vegas);
        Vegas.setBounds(110, 40, 570, 230);

        NomeJogador1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NomeJogador1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NomeJogador1);
        NomeJogador1.setBounds(370, 460, 230, 30);

        Status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Status);
        Status.setBounds(370, 520, 190, 30);

        jButton1.setText("Subir Aposta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 520, 110, 30);

        DisplayAposta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DisplayAposta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DisplayAposta);
        DisplayAposta.setBounds(240, 490, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor Aposta");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 460, 120, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/background.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 800, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OutraCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutraCartaActionPerformed

        if (iniciarjogo == true) {

            if (cartasjogador < 5) {
                MaoJogador = mesa.nextInt(13) + 1;
                switch (MaoJogador) {
                    case 1:
                        MaoJogadorNumero = MaoJogadorNumero + 1;
                        NaipeNumeroJogador = mesa.nextInt(3);
                        cartasjogador = cartasjogador + 1;
                        Naipe = NaipeFunction(NaipeNumeroJogador);
                        baralho[contadorMaquina] = MaoJogador + Naipe;
                        PedeOutraCarta = RetornaCarta(baralho[contadorMaquina]);
                        cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                        contadorMaquina = contadorMaquina + 1;
                        break;
                    case 11:
                        MaoJogadorNumero = MaoJogadorNumero + 10;
                        cartasjogador = cartasjogador + 1;
                        baralho[contadorMaquina] = 10 + Naipe;
                        PedeOutraCarta = RetornaCarta(baralho[contadorMaquina]);
                        cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                        contadorMaquina = contadorMaquina + 1;
                        break;
                    case 12:
                        MaoJogadorNumero = MaoJogadorNumero + 10;
                        cartasjogador = cartasjogador + 1;
                        baralho[contadorMaquina] = 10 + Naipe;
                        PedeOutraCarta = RetornaCarta(baralho[contadorMaquina]);
                        cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                        contadorMaquina = contadorMaquina + 1;
                        break;
                    case 13:
                        MaoJogadorNumero = MaoJogadorNumero + 10;
                        cartasjogador = cartasjogador + 1;
                        baralho[contadorMaquina] = 10 + Naipe;
                        PedeOutraCarta = RetornaCarta(baralho[contadorMaquina]);
                        cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                        contadorMaquina = contadorMaquina + 1;
                        break;
                    default:
                        MaoJogadorNumero = MaoJogadorNumero + MaoJogador;
                        cartasjogador = cartasjogador + 1;
                        NaipeNumeroJogador = mesa.nextInt(3);
                        NaipeNumeroMaquina = mesa.nextInt(3);
                        baralho[contadorMaquina] = MaoJogador + Naipe;
                        PedeOutraCarta = RetornaCarta(baralho[contadorMaquina]);
                        cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                        contadorMaquina = contadorMaquina + 1;
                        break;
                }

            }
            System.out.println(cartavalida);
            if (contadorMaquina == 3) {
                ImagemCarta3.setIcon(PedeOutraCarta);

            } else if (contadorMaquina == 4) {
                ImagemCarta4.setIcon(PedeOutraCarta);

            } else if (contadorMaquina == 5) {
                ImagemCarta5.setIcon(PedeOutraCarta);

            }

            Status.setText(String.valueOf("Sua mão tem " + MaoJogadorNumero));

            if (MaoMesaNumero < 18 && cartasmaquina < 5) {

                maquinapedeoutra = mesa.nextInt(4) + 1;

                if (maquinapedeoutra == 1 || maquinapedeoutra == 2) {
                    MaoMesaoutracarta = mesa.nextInt(13) + 1;
                    JOptionPane.showMessageDialog(null, "A Mesa pediu outra carta");

                    switch (MaoMesaoutracarta) {
                        case 1:
                            MaoMesaNumero = MaoMesaNumero + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = MaoMesaoutracarta + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        case 11:
                            MaoMesaNumero = MaoMesaNumero + 10;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = 10 + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        case 12:
                            MaoMesaNumero = MaoMesaNumero + 10;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = 10 + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        case 13:
                            MaoMesaNumero = MaoMesaNumero + 10;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = 10 + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        default:
                            MaoMesaNumero = MaoMesaNumero + MaoMesaoutracarta;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = MaoMesaoutracarta + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A Mesa passou");
                }
                System.out.println("A Mesa tem " + MaoMesaNumero);

                if (MaoJogadorNumero > 21 && MaoMesaNumero <= 21) {
                    JOptionPane.showMessageDialog(null, "Você estourou com " + MaoJogadorNumero + " na mão");
                    ReiniciarJogoActionPerformed(evt);

                }
                if (MaoMesaNumero > 21 && MaoJogadorNumero <= 21) {
                    JOptionPane.showMessageDialog(null, "Você Ganhou, a mesa estourou com " + MaoMesaNumero + " na mão. Você faturou R$" + ValorAposta);
                    ReiniciarJogoActionPerformed(evt);

                }

                if (MaoJogadorNumero == 21 && MaoMesaNumero < 21) {
                    JOptionPane.showMessageDialog(null, "Você GANHOU com " + MaoJogadorNumero + " na mão. Você faturou R$" + ValorAposta);

                }
                if (MaoMesaNumero == 21 && MaoJogadorNumero < 21) {
                    JOptionPane.showMessageDialog(null, "Você Perdeu com " + MaoJogadorNumero + " na mão e a mesa com " + MaoMesaNumero);

                }

                if (MaoMesaNumero == 21 && MaoJogadorNumero == 21) {
                    JOptionPane.showMessageDialog(null, "Ambos empataram com 21");

                }

                if (cartasjogador == 5) {
                    JOptionPane.showMessageDialog(null, "Você já tem 5 cartas");
                }

                if (cartasmaquina == 5) {

                    JOptionPane.showMessageDialog(null, "A Mesa já tem 5 cartas e aguarda sua jogada");
                }

            }


    }//GEN-LAST:event_OutraCartaActionPerformed
    }
    private void BotaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIniciarActionPerformed

        if (iniciarjogo == false) {

            while (nomejogadorvalido == false) {

                Jogador1 = JOptionPane.showInputDialog("Digite o nome do Jogador");

                if (Jogador1.equals("") || Jogador1.equals(" ") || Jogador1.equals("   ")) {
                    JOptionPane.showMessageDialog(null, "Nome do Jogador inválido");
                } else {
                    NomeJogador1.setText(String.valueOf("Jogador " + Jogador1));
                    nomejogadorvalido = true;
                }
            }

            //CARTA 1
            MaoJogador = mesa.nextInt(13) + 1;
            NaipeNumeroJogador = mesa.nextInt(3);
            NaipeNumeroMaquina = mesa.nextInt(3);
            MaoMesa = mesa.nextInt(13) + 1;
            switch (MaoJogador) {
                case 1:
                    MaoJogadorNumero = MaoJogadorNumero + 1;
                    MaoMesaNumero = MaoMesaNumero + 1;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua primeira carta foi um AS de Naipe " + Naipe + ". Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = MaoJogador + Naipe;
                    carta1 = RetornaCarta(baralho[contadorMaquina]);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                case 11:
                    MaoJogadorNumero = MaoJogadorNumero + 10;
                    MaoMesaNumero = MaoMesaNumero + 10;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua primeira carta foi um Valete de " + Naipe + " . Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = 10 + Naipe + "VALETE";
                    carta1 = RetornaCarta(baralho[contadorMaquina]);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                case 12:
                    MaoJogadorNumero = MaoJogadorNumero + 10;
                    MaoMesaNumero = MaoMesaNumero + 10;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    // JOptionPane.showMessageDialog(null, "Sua primeira carta foi um Rei de " + Naipe + " . Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = 10 + Naipe + "REI";
                    carta1 = RetornaCarta(baralho[contadorMaquina]);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                case 13:
                    MaoJogadorNumero = MaoJogadorNumero + 10;
                    MaoMesaNumero = MaoMesaNumero + 10;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua primeira carta foi uma Dama de " + Naipe + " . Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = 10 + Naipe + "DAMA";
                    carta1 = RetornaCarta(baralho[contadorMaquina]);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                default:
                    MaoJogadorNumero = MaoJogadorNumero + MaoJogador;
                    MaoMesaNumero = MaoMesaNumero + MaoMesa;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua primeira carta foi um " + MaoJogador + " de Naipe " + Naipe + ". Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = MaoJogador + Naipe;
                    carta1 = RetornaCarta(baralho[contadorMaquina]);
                    contadorMaquina = contadorMaquina + 1;
                    break;

            }

            Status.setText(String.valueOf("Sua mão tem " + MaoJogadorNumero));
            System.out.println("Mesa tirou um " + MaoMesaNumero);

            //CARTA 2
            MaoJogador = mesa.nextInt(13) + 1;
            NaipeNumeroJogador = mesa.nextInt(3);
            NaipeNumeroMaquina = mesa.nextInt(3);
            MaoMesa = mesa.nextInt(13) + 1;
            switch (MaoJogador) {
                case 1:
                    MaoJogadorNumero = MaoJogadorNumero + 1;
                    MaoMesaNumero = MaoMesaNumero + 1;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua segunda carta foi um AS de Naipe " + Naipe + ". Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = MaoJogador + Naipe;
                    ImagemCarta1.setIcon(carta1);
                    carta2 = RetornaCarta(baralho[contadorMaquina]);
                    cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                case 11:
                    MaoJogadorNumero = MaoJogadorNumero + 10;
                    MaoMesaNumero = MaoMesaNumero + 10;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua segunda carta foi um Valete de " + Naipe + " . Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = 10 + Naipe + "VALETE";
                    carta2 = RetornaCarta(baralho[contadorMaquina]);
                    cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                case 12:
                    MaoJogadorNumero = MaoJogadorNumero + 10;
                    MaoMesaNumero = MaoMesaNumero + 10;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua segunda carta foi um Rei de " + Naipe + " . Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = 10 + Naipe + "REI";
                    carta2 = RetornaCarta(baralho[contadorMaquina]);
                    cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                case 13:
                    MaoJogadorNumero = MaoJogadorNumero + 10;
                    MaoMesaNumero = MaoMesaNumero + 10;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua segunda carta foi uma Dama de " + Naipe + " . Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = 10 + Naipe + "DAMA";
                    carta2 = RetornaCarta(baralho[contadorMaquina]);
                    cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                    contadorMaquina = contadorMaquina + 1;
                    break;
                default:
                    MaoJogadorNumero = MaoJogadorNumero + MaoJogador;
                    MaoMesaNumero = MaoMesaNumero + MaoMesa;
                    NaipeNumeroJogador = mesa.nextInt(3);
                    NaipeNumeroMaquina = mesa.nextInt(3);
                    Naipe = NaipeFunction(NaipeNumeroJogador);
                    //JOptionPane.showMessageDialog(null, "Sua segunda carta foi um " + MaoJogador + " de Naipe " + Naipe + ". Sua mão tem " + MaoJogadorNumero);
                    baralho[contadorMaquina] = MaoJogador + Naipe;
                    carta2 = RetornaCarta(baralho[contadorMaquina]);
                    cartavalida = CartaRepetida(baralho, MaoJogador, Naipe);
                    contadorMaquina = contadorMaquina + 1;
                    break;
            }
            System.out.println(cartavalida);
            Status.setText(String.valueOf("Sua mão tem " + MaoJogadorNumero));
            ImagemCarta1.setIcon(carta1);
            ImagemCarta2.setIcon(carta2);
            ImagemCarta3.setIcon(carta3);
            ImagemCarta4.setIcon(carta4);
            ImagemCarta5.setIcon(carta5);
            System.out.println("Mesa tirou um " + MaoMesaNumero);

            DisplayAposta.setText(String.valueOf("R$" + ValorAposta));

        }

        Vegas.setIcon(Vegas_Baby_Gif);

        iniciarjogo = true;

    }//GEN-LAST:event_BotaoIniciarActionPerformed

    private void ReiniciarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarJogoActionPerformed

        iniciarjogo = false;
        nomejogadorvalido = false;

        cartasjogador = 0;
        cartasmaquina = 0;
        contadorMesa = 0;
        contadorMaquina = 0;

        Status.setText(String.valueOf(" "));

        ValorAposta = 20;

        MaoJogadorNumero = 0;
        MaoMesaNumero = 0;

        NomeJogador1.setText(String.valueOf(""));

        for (int i = 0; i < baralho.length; i++) {
            baralho[i] = " ";
        }

        for (int i = 0; i < baralhoMesa.length; i++) {
            baralhoMesa[i] = " ";
        }
        BotaoIniciarActionPerformed(evt);


    }//GEN-LAST:event_ReiniciarJogoActionPerformed

    private void PararJogadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararJogadaActionPerformed

        if (iniciarjogo == true) {

            while (MaoMesaNumero < 18 && cartasmaquina < 5) {

                maquinapedeoutra = mesa.nextInt(4) + 1;

                if (maquinapedeoutra == 1 || maquinapedeoutra == 2) {
                    MaoMesaoutracarta = mesa.nextInt(13) + 1;
                    JOptionPane.showMessageDialog(null, "A maquina pediu outra carta");

                    switch (MaoMesaoutracarta) {
                        case 1:
                            MaoMesaNumero = MaoMesaNumero + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = MaoMesaoutracarta + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        case 11:
                            MaoMesaNumero = MaoMesaNumero + 10;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = 10 + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        case 12:
                            MaoMesaNumero = MaoMesaNumero + 10;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = 10 + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        case 13:
                            MaoMesaNumero = MaoMesaNumero + 10;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = 10 + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                        default:
                            MaoMesaNumero = MaoMesaNumero + MaoMesaoutracarta;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            cartasmaquina = cartasmaquina + 1;
                            NaipeNumeroMaquina = mesa.nextInt(3);
                            Naipe = NaipeFunction(NaipeNumeroMaquina);
                            baralhoMesa[contadorMesa] = MaoMesaoutracarta + Naipe;
                            contadorMesa = contadorMesa + 1;
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A Mesa passou");
                }
                System.out.println("a maquina tem " + MaoMesaNumero);

            }JOptionPane.showMessageDialog(null, "A Mesa parou de pedir carta");


            if (MaoJogadorNumero > 21 && MaoMesaNumero <= 21) {
                JOptionPane.showMessageDialog(null, "Você estourou com " + MaoJogadorNumero + " na mão");
                ReiniciarJogoActionPerformed(evt);

            }
            if (MaoMesaNumero > 21 && MaoJogadorNumero <= 21) {
                JOptionPane.showMessageDialog(null, "Você Ganhou, a Mesa estourou com " + MaoMesaNumero + " na mão. Você faturou R$" + ValorAposta);
                ReiniciarJogoActionPerformed(evt);

            }

            if (MaoJogadorNumero == 21 && MaoMesaNumero < 21) {
                JOptionPane.showMessageDialog(null, "Você GANHOU com " + MaoJogadorNumero + " na mão. Você faturou R$" + ValorAposta);

            }
            if (MaoMesaNumero == 21 && MaoJogadorNumero < 21) {
                JOptionPane.showMessageDialog(null, "Você Perdeu com " + MaoJogadorNumero + " na mão e a mesa com " + MaoMesaNumero);

            }

            if (MaoMesaNumero == 21 && MaoJogadorNumero == 21) {
                JOptionPane.showMessageDialog(null, "Ambos empataram com 21");

            }

            if (cartasjogador == 5) {
                JOptionPane.showMessageDialog(null, "Você já tem 5 cartas");
            }

            if (cartasmaquina == 5) {

                JOptionPane.showMessageDialog(null, "A Mesa já tem 5 cartas e aguarda sua jogada");
            }// TODO add your handling code here:
    }//GEN-LAST:event_PararJogadaActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ValorAposta = ValorAposta + 20;

        DisplayAposta.setText(String.valueOf("R$" + ValorAposta));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        for (int i = 0; i < baralho.length; i++) {
            baralho[i] = " ";
        }

        boolean cartavalida = false;

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setSize(805, 660);
                telaInicial.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoIniciar;
    private javax.swing.JLabel DisplayAposta;
    private javax.swing.JLabel ImagemCarta1;
    private javax.swing.JLabel ImagemCarta2;
    private javax.swing.JLabel ImagemCarta3;
    private javax.swing.JLabel ImagemCarta4;
    private javax.swing.JLabel ImagemCarta5;
    private javax.swing.JLabel NomeJogador1;
    private javax.swing.JButton OutraCarta;
    private javax.swing.JButton PararJogada;
    private javax.swing.JButton ReiniciarJogo;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Vegas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4Resultado;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
