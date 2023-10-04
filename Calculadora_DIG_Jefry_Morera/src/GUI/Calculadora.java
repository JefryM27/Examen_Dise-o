package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher Matus
 */
public class Calculadora extends javax.swing.JFrame {

    int n1 = 0;
    int n2 = 0;
    String signo = "";
    private int ultimoNumeroGuardado = 0;

    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.numerosNegativos();
        this.guardarMemoria();
        this.sumarMemoria();
        this.restarMemoria();
        this.recuperarMemoria();
        this.borrarMemoria();
        this.calcularPorcentaje();
        this.borrarUltimo();
        this.calcularModulo();
    }

    private void numerosNegativos() {
        // Obtener el contenido del campo de texto
        String texto = txtPantallita.getText();

        try {
            // Convertir a número y hacer negativo
            double numero = Integer.parseInt(texto);
            numero = -numero;

            // Establecer el resultado nuevamente en el campo de texto
            txtPantallita.setText(String.valueOf(numero));
        } catch (NumberFormatException ex) {

        }
    }

    private void sumarMemoria() {
        String texto = txtPantallita.getText();

        try {
            int numero = Integer.parseInt(texto);
            int resultado = ultimoNumeroGuardado + numero; // Sumar el último número guardado con el nuevo número
            txtPantallita.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {

        }
    }

    private void restarMemoria() {
        String texto = txtPantallita.getText();

        try {
            int numero = Integer.parseInt(texto);
            int resultado = ultimoNumeroGuardado - numero; // Sumar el último número guardado con el nuevo número
            txtPantallita.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {

        }
    }

    private void guardarMemoria() {
        String texto = txtPantallita.getText();

        try {
            int numero = Integer.parseInt(texto);
            ultimoNumeroGuardado = numero; // Actualizar el último número guardado

        } catch (NumberFormatException ex) {

        }
    }

    private void recuperarMemoria() {
        txtPantallita.setText(String.valueOf(ultimoNumeroGuardado));
    }

    private void borrarMemoria() {
        ultimoNumeroGuardado = 0;

    }

    private void calcularPorcentaje() {
        String texto = txtPantallita.getText();

        try {
            double numero = Double.parseDouble(texto);
            double porcentaje = numero * 100; // Calcular el 100% del número
            txtPantallita.setText(String.valueOf(porcentaje));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El contenido no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarUltimo() {
        String texto = txtPantallita.getText();

        if (!texto.isEmpty()) {
            texto = texto.substring(0, texto.length() - 1); // Eliminar el último carácter
            txtPantallita.setText(texto);
        }
    }

    private void calcularModulo() {
        String texto = txtPantallita.getText();

        try {
            double numero = Double.parseDouble(texto);
            // Realizar la operación de módulo, por ejemplo, modulo 5 devuelve el residuo de la división por 5
            double resultado = numero % ultimoNumeroGuardado;
            txtPantallita.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El contenido no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSiete = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnTres1 = new javax.swing.JButton();
        btnCocienteDivision = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        btnBorrarUltimo = new javax.swing.JButton();
        btnRecuperarNumero = new javax.swing.JButton();
        btnRestarMemoria = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnBorrarMemoria = new javax.swing.JButton();
        btnMostrarNumeroGuardado = new javax.swing.JButton();
        btnSumaMemoria = new javax.swing.JButton();
        btnNumerosNegativos = new javax.swing.JButton();
        txtPantallita = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton6.setText("jButton6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnSiete.setBackground(new java.awt.Color(255, 255, 255));
        btnSiete.setForeground(new java.awt.Color(0, 0, 0));
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(255, 255, 255));
        btnCuatro.setForeground(new java.awt.Color(0, 0, 0));
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(255, 255, 255));
        btnUno.setForeground(new java.awt.Color(0, 0, 0));
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(255, 255, 255));
        btnCero.setForeground(new java.awt.Color(0, 0, 0));
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(255, 255, 255));
        btnOcho.setForeground(new java.awt.Color(0, 0, 0));
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(255, 255, 255));
        btnCinco.setForeground(new java.awt.Color(0, 0, 0));
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(255, 255, 255));
        btnDos.setForeground(new java.awt.Color(0, 0, 0));
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(255, 255, 255));
        btnNueve.setForeground(new java.awt.Color(0, 0, 0));
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(255, 255, 255));
        btnTres.setForeground(new java.awt.Color(0, 0, 0));
        btnTres.setText(",");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(255, 255, 255));
        btnSeis.setForeground(new java.awt.Color(0, 0, 0));
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("CE");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(0, 0, 0));
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(0, 0, 0));
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(0, 0, 0));
        btnDividir.setForeground(new java.awt.Color(255, 255, 255));
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(0, 0, 0));
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 0, 0));
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnTres1.setBackground(new java.awt.Color(255, 255, 255));
        btnTres1.setForeground(new java.awt.Color(0, 0, 0));
        btnTres1.setText("3");
        btnTres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTres1ActionPerformed(evt);
            }
        });

        btnCocienteDivision.setBackground(new java.awt.Color(0, 0, 0));
        btnCocienteDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnCocienteDivision.setText("MOD");
        btnCocienteDivision.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCocienteDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocienteDivisionActionPerformed(evt);
            }
        });

        btnBorrar1.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar1.setText("C");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        btnBorrar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnBorrar1KeyReleased(evt);
            }
        });

        btnBorrarUltimo.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarUltimo.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarUltimo.setText("<---");
        btnBorrarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUltimoActionPerformed(evt);
            }
        });

        btnRecuperarNumero.setBackground(new java.awt.Color(0, 0, 0));
        btnRecuperarNumero.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperarNumero.setText("MR");
        btnRecuperarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarNumeroActionPerformed(evt);
            }
        });

        btnRestarMemoria.setBackground(new java.awt.Color(0, 0, 0));
        btnRestarMemoria.setForeground(new java.awt.Color(255, 255, 255));
        btnRestarMemoria.setText("M-");
        btnRestarMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarMemoriaActionPerformed(evt);
            }
        });

        btnPorcentaje.setBackground(new java.awt.Color(0, 0, 0));
        btnPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });

        btnBorrarMemoria.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarMemoria.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarMemoria.setText("MC");
        btnBorrarMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarMemoriaActionPerformed(evt);
            }
        });

        btnMostrarNumeroGuardado.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrarNumeroGuardado.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarNumeroGuardado.setText("MS");
        btnMostrarNumeroGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarNumeroGuardadoActionPerformed(evt);
            }
        });

        btnSumaMemoria.setBackground(new java.awt.Color(0, 0, 0));
        btnSumaMemoria.setForeground(new java.awt.Color(255, 255, 255));
        btnSumaMemoria.setText("M+");
        btnSumaMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaMemoriaActionPerformed(evt);
            }
        });

        btnNumerosNegativos.setBackground(new java.awt.Color(0, 0, 0));
        btnNumerosNegativos.setForeground(new java.awt.Color(255, 255, 255));
        btnNumerosNegativos.setText("(-)");
        btnNumerosNegativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumerosNegativosActionPerformed(evt);
            }
        });

        txtPantallita.setBackground(new java.awt.Color(255, 255, 255));
        txtPantallita.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPantallita.setForeground(new java.awt.Color(0, 0, 0));
        txtPantallita.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBorrarUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btnTres1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCocienteDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(btnNumerosNegativos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnBorrarMemoria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRecuperarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMostrarNumeroGuardado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSumaMemoria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRestarMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPantallita, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantallita, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecuperarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestarMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarNumeroGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumaMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNumerosNegativos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 104, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTres1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCocienteDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarMemoriaActionPerformed
        this.borrarMemoria();
    }//GEN-LAST:event_btnBorrarMemoriaActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        this.calcularPorcentaje();
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnRestarMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarMemoriaActionPerformed
        this.restarMemoria();
        System.out.println(txtPantallita.getText());
    }//GEN-LAST:event_btnRestarMemoriaActionPerformed

    private void btnRecuperarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarNumeroActionPerformed
        this.recuperarMemoria();
    }//GEN-LAST:event_btnRecuperarNumeroActionPerformed

    private void btnBorrarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUltimoActionPerformed
        this.borrarUltimo();
    }//GEN-LAST:event_btnBorrarUltimoActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        txtPantallita.setText("");
    }//GEN-LAST:event_btnBorrar1ActionPerformed

    private void btnCocienteDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocienteDivisionActionPerformed
        this.calcularModulo();
    }//GEN-LAST:event_btnCocienteDivisionActionPerformed

    private void btnTres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTres1ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        n2 = Integer.parseInt(txtPantallita.getText());

        switch (signo) {
            case "+":
                txtPantallita.setText(Integer.toString(n1 + n2));
                break;
            case "*":
                txtPantallita.setText(Integer.toString(n1 * n2));
                break;
            case "/":
                if (n2 != 0) {
                    txtPantallita.setText(Integer.toString(n1 / n2));
                } else {
                    txtPantallita.setText("Error: División por cero");
                }
                break;
            case "-":
                txtPantallita.setText(Integer.toString(n1 - n2));
                break;
            default:
                txtPantallita.setText("Error: Operador no válido");
                break;
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        n1 = Integer.parseInt(txtPantallita.getText());
        signo = "+";
        txtPantallita.setText("+");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        n1 = Integer.parseInt(txtPantallita.getText());
        signo = "/";
        txtPantallita.setText("");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed

        n1 = Integer.parseInt(txtPantallita.getText());
        signo = "-";
        txtPantallita.setText("");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed

        n1 = Integer.parseInt(txtPantallita.getText());
        signo = "*";
        txtPantallita.setText("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        txtPantallita.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        // TODO add your handling code here:
        txtPantallita.setText(txtPantallita.getText() + "7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnMostrarNumeroGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarNumeroGuardadoActionPerformed
        this.guardarMemoria();
        System.out.println(txtPantallita.getText());
        JOptionPane.showMessageDialog(null, "El numero se guardo en memoria (Consola)");
    }//GEN-LAST:event_btnMostrarNumeroGuardadoActionPerformed

    private void btnSumaMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaMemoriaActionPerformed
        this.sumarMemoria();
        System.out.println(txtPantallita.getText());
    }//GEN-LAST:event_btnSumaMemoriaActionPerformed

    private void btnNumerosNegativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumerosNegativosActionPerformed
        this.numerosNegativos();
    }//GEN-LAST:event_btnNumerosNegativosActionPerformed

    private void btnBorrar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBorrar1KeyReleased

    }//GEN-LAST:event_btnBorrar1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBorrarMemoria;
    private javax.swing.JButton btnBorrarUltimo;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCocienteDivision;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMostrarNumeroGuardado;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnNumerosNegativos;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnRecuperarNumero;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnRestarMemoria;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumaMemoria;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnTres1;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtPantallita;
    // End of variables declaration//GEN-END:variables
}
