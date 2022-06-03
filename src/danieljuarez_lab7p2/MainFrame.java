/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danieljuarez_lab7p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    static Usuario Current = null;

    public MainFrame() {
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

        SpotifyType = new javax.swing.ButtonGroup();
        ArtistWindow = new javax.swing.JDialog();
        SpotifyForArtists = new javax.swing.JLabel();
        UploadSingleButton = new javax.swing.JButton();
        UploadAlbumButton = new javax.swing.JButton();
        ArtistTreeScrollPane = new javax.swing.JScrollPane();
        ArtistTree = new javax.swing.JTree();
        UploadSingleFrame = new javax.swing.JDialog();
        UploadSingle = new javax.swing.JLabel();
        SingleTitle = new javax.swing.JLabel();
        tf_SingleTitulo = new javax.swing.JTextField();
        SingleFecha = new javax.swing.JLabel();
        SingleFechaChooser = new com.toedter.calendar.JDateChooser();
        CrearSingleButton = new javax.swing.JButton();
        UploadAlbumFrame = new javax.swing.JDialog();
        UploadAlbum = new javax.swing.JLabel();
        AlbumTitle = new javax.swing.JLabel();
        tf_AlbumTitulo = new javax.swing.JTextField();
        AlbumFecha = new javax.swing.JLabel();
        AlbumFechaChooser = new com.toedter.calendar.JDateChooser();
        CuentaCanciones = new javax.swing.JLabel();
        tf_CuentaCanciones = new javax.swing.JTextField();
        CrearAlbumButton = new javax.swing.JButton();
        CreateSongFrame = new javax.swing.JDialog();
        CreateSong = new javax.swing.JLabel();
        SongTitulo = new javax.swing.JLabel();
        tf_SongTitulo = new javax.swing.JTextField();
        SongDuracion = new javax.swing.JLabel();
        tf_SongDuracion = new javax.swing.JTextField();
        CrearSongButton = new javax.swing.JButton();
        UserWindow = new javax.swing.JDialog();
        SpotifyForClients = new javax.swing.JLabel();
        SignUpTitle = new javax.swing.JLabel();
        Spotify = new javax.swing.JRadioButton();
        SpotifyArtists = new javax.swing.JRadioButton();
        Username = new javax.swing.JLabel();
        tf_Username = new javax.swing.JTextField();
        NombreArtistico = new javax.swing.JLabel();
        tf_NombreArtistico = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        tf_Password = new javax.swing.JTextField();
        Edad = new javax.swing.JLabel();
        tf_Edad = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();

        SpotifyForArtists.setText("Spotify For Artists");

        UploadSingleButton.setText("Upload Single");
        UploadSingleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UploadSingleButtonMouseClicked(evt);
            }
        });
        UploadSingleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadSingleButtonActionPerformed(evt);
            }
        });

        UploadAlbumButton.setText("Upload Album");
        UploadAlbumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UploadAlbumButtonMouseClicked(evt);
            }
        });
        UploadAlbumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadAlbumButtonActionPerformed(evt);
            }
        });

        ArtistTreeScrollPane.setViewportView(ArtistTree);

        javax.swing.GroupLayout ArtistWindowLayout = new javax.swing.GroupLayout(ArtistWindow.getContentPane());
        ArtistWindow.getContentPane().setLayout(ArtistWindowLayout);
        ArtistWindowLayout.setHorizontalGroup(
            ArtistWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArtistWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArtistWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SpotifyForArtists)
                    .addGroup(ArtistWindowLayout.createSequentialGroup()
                        .addComponent(UploadSingleButton)
                        .addGap(18, 18, 18)
                        .addComponent(UploadAlbumButton))
                    .addComponent(ArtistTreeScrollPane))
                .addContainerGap(478, Short.MAX_VALUE))
        );
        ArtistWindowLayout.setVerticalGroup(
            ArtistWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArtistWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpotifyForArtists)
                .addGap(18, 18, 18)
                .addGroup(ArtistWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadSingleButton)
                    .addComponent(UploadAlbumButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ArtistTreeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        UploadSingle.setText("Upload Single");

        SingleTitle.setText("Título");

        SingleFecha.setText("Fecha");

        CrearSingleButton.setText("Crear");
        CrearSingleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearSingleButtonMouseClicked(evt);
            }
        });
        CrearSingleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearSingleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UploadSingleFrameLayout = new javax.swing.GroupLayout(UploadSingleFrame.getContentPane());
        UploadSingleFrame.getContentPane().setLayout(UploadSingleFrameLayout);
        UploadSingleFrameLayout.setHorizontalGroup(
            UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadSingleFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CrearSingleButton)
                    .addGroup(UploadSingleFrameLayout.createSequentialGroup()
                        .addGroup(UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UploadSingle)
                            .addComponent(SingleTitle)
                            .addComponent(SingleFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_SingleTitulo)
                            .addComponent(SingleFechaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        UploadSingleFrameLayout.setVerticalGroup(
            UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadSingleFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UploadSingle)
                .addGap(64, 64, 64)
                .addGroup(UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UploadSingleFrameLayout.createSequentialGroup()
                        .addGroup(UploadSingleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SingleTitle)
                            .addComponent(tf_SingleTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(SingleFecha))
                    .addComponent(SingleFechaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(CrearSingleButton)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        UploadAlbum.setText("Upload Album");

        AlbumTitle.setText("Título");

        AlbumFecha.setText("Fecha");

        CuentaCanciones.setText("Canciones");

        CrearAlbumButton.setText("Crear");
        CrearAlbumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearAlbumButtonMouseClicked(evt);
            }
        });
        CrearAlbumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAlbumButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UploadAlbumFrameLayout = new javax.swing.GroupLayout(UploadAlbumFrame.getContentPane());
        UploadAlbumFrame.getContentPane().setLayout(UploadAlbumFrameLayout);
        UploadAlbumFrameLayout.setHorizontalGroup(
            UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadAlbumFrameLayout.createSequentialGroup()
                .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UploadAlbumFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CrearAlbumButton))
                    .addGroup(UploadAlbumFrameLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UploadAlbum)
                            .addGroup(UploadAlbumFrameLayout.createSequentialGroup()
                                .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UploadAlbumFrameLayout.createSequentialGroup()
                                        .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CuentaCanciones)
                                            .addComponent(AlbumFecha))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UploadAlbumFrameLayout.createSequentialGroup()
                                        .addComponent(AlbumTitle)
                                        .addGap(13, 13, 13)))
                                .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AlbumFechaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(tf_CuentaCanciones)
                                    .addComponent(tf_AlbumTitulo))))))
                .addGap(480, 480, 480))
        );
        UploadAlbumFrameLayout.setVerticalGroup(
            UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UploadAlbumFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UploadAlbum)
                .addGap(64, 64, 64)
                .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UploadAlbumFrameLayout.createSequentialGroup()
                        .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlbumTitle)
                            .addComponent(tf_AlbumTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AlbumFecha))
                    .addComponent(AlbumFechaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UploadAlbumFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuentaCanciones)
                    .addComponent(tf_CuentaCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(CrearAlbumButton)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        CreateSong.setText("Create Song");

        SongTitulo.setText("Título");

        tf_SongTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_SongTituloActionPerformed(evt);
            }
        });

        SongDuracion.setText("Duración");

        CrearSongButton.setText("Crear");
        CrearSongButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearSongButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CreateSongFrameLayout = new javax.swing.GroupLayout(CreateSongFrame.getContentPane());
        CreateSongFrame.getContentPane().setLayout(CreateSongFrameLayout);
        CreateSongFrameLayout.setHorizontalGroup(
            CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateSongFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateSong)
                    .addGroup(CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CrearSongButton)
                        .addGroup(CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CreateSongFrameLayout.createSequentialGroup()
                                .addComponent(SongTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_SongTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CreateSongFrameLayout.createSequentialGroup()
                                .addComponent(SongDuracion)
                                .addGap(18, 18, 18)
                                .addComponent(tf_SongDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(529, Short.MAX_VALUE))
        );
        CreateSongFrameLayout.setVerticalGroup(
            CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateSongFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreateSong)
                .addGap(43, 43, 43)
                .addGroup(CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SongTitulo)
                    .addComponent(tf_SongTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreateSongFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SongDuracion)
                    .addComponent(tf_SongDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CrearSongButton)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        SpotifyForClients.setText("Spotify");

        javax.swing.GroupLayout UserWindowLayout = new javax.swing.GroupLayout(UserWindow.getContentPane());
        UserWindow.getContentPane().setLayout(UserWindowLayout);
        UserWindowLayout.setHorizontalGroup(
            UserWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpotifyForClients)
                .addContainerGap(656, Short.MAX_VALUE))
        );
        UserWindowLayout.setVerticalGroup(
            UserWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpotifyForClients)
                .addContainerGap(375, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignUpTitle.setText("Spotify Sign Up");

        SpotifyType.add(Spotify);
        Spotify.setText("Spotify");

        SpotifyType.add(SpotifyArtists);
        SpotifyArtists.setText("Spotify for Artists");
        SpotifyArtists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpotifyArtistsActionPerformed(evt);
            }
        });

        Username.setText("Username");

        tf_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UsernameActionPerformed(evt);
            }
        });

        NombreArtistico.setText("Nombre Artístico");

        tf_NombreArtistico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NombreArtisticoActionPerformed(evt);
            }
        });

        Password.setText("Password");

        Edad.setText("Edad");

        tf_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EdadActionPerformed(evt);
            }
        });

        LogIn.setText("Log In");
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });

        SignUp.setText("Sign Up");
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LogIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SignUp))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SignUpTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Spotify)
                                    .addComponent(Username))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpotifyArtists)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_Edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                        .addComponent(tf_Password, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tf_Username, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tf_NombreArtistico, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(Password)
                            .addComponent(Edad)
                            .addComponent(NombreArtistico))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignUpTitle)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Spotify)
                    .addComponent(SpotifyArtists))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(tf_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreArtistico)
                    .addComponent(tf_NombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(tf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn)
                    .addComponent(SignUp))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SpotifyArtistsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpotifyArtistsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpotifyArtistsActionPerformed

    private void tf_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UsernameActionPerformed

    private void tf_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EdadActionPerformed

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        boolean existe = false;
        for (int i = 0; i < AllUsers.size(); i++) {
            if (tf_Username.getText().equals(AllUsers.get(i).getUsername())) {
                existe = true;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(this, "El Usuario Ya Existe, Haga Log In.");
            tf_Username.setText("");
            tf_NombreArtistico.setText("");
            tf_Password.setText("");
            tf_Edad.setText("");
            Spotify.setSelected(false);
            SpotifyArtists.setSelected(false);
        } else {
            Date Fecha;
            Fecha = new Date();
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                File f = null;
                f = new File("./SpotifyUsers.txt");
                fw = new FileWriter(f, true); //si NO EXISTE -> Crea || sí YA EXISTE -> Agrega
                bw = new BufferedWriter(fw);
                if (Spotify.isSelected()) {
//                bw.write(tf_Username.getText() + ";" + Spotify.getName() + ";" + Fecha);
                    bw.write(tf_Username.getText() + ";" + "Regular" + ";" + Fecha);
                    Usuario user = new Cliente(tf_Username.getText(), tf_Password.getText(), Integer.parseInt(tf_Edad.getText()));
                    AllUsers.add(user);
                    JOptionPane.showMessageDialog(this, "Usuario Creado con Éxito.");
                }
                if (SpotifyArtists.isSelected()) {
                    bw.write(tf_Username.getText() + ";" + "Artista" + ";" + Fecha);
                    Usuario user = new Artista(tf_NombreArtistico.getText(), tf_Username.getText(), tf_Password.getText(), Integer.parseInt(tf_Edad.getText()));
                    AllUsers.add(user);
                    JOptionPane.showMessageDialog(this, "Artista Creado con Éxito.");
                }
                bw.newLine();
                bw.flush();
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
            tf_Username.setText("");
            tf_NombreArtistico.setText("");
            tf_Password.setText("");
            tf_Edad.setText("");
            Spotify.setSelected(false);
            SpotifyArtists.setSelected(false);
        }
    }//GEN-LAST:event_SignUpMouseClicked

    private void tf_NombreArtisticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NombreArtisticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NombreArtisticoActionPerformed

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        boolean existe = false;
        for (int i = 0; i < AllUsers.size(); i++) {
            if (tf_Username.getText().equals(AllUsers.get(i).getUsername())) {
                existe = true;
                Current = AllUsers.get(i);
            }
        }
        if (existe) {
            if (Current.getTipo().equals("Artista")) {
                ArtistWindow.setModal(true);
                ArtistWindow.pack();
                ArtistWindow.setLocationRelativeTo(this);
                ArtistWindow.setVisible(true);
            }
            if (Current.getTipo().equals("Cliente")) {
                UserWindow.setModal(true);
                UserWindow.pack();
                UserWindow.setLocationRelativeTo(this);
                UserWindow.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El Usuario No Existe, Haga Sign Up.");
        }
    }//GEN-LAST:event_LogInMouseClicked

    private void UploadAlbumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadAlbumButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadAlbumButtonActionPerformed

    private void UploadSingleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadSingleButtonMouseClicked
        UploadSingleFrame.setModal(true);
        UploadSingleFrame.pack();
        UploadSingleFrame.setLocationRelativeTo(this);
        UploadSingleFrame.setVisible(true);
    }//GEN-LAST:event_UploadSingleButtonMouseClicked

    private void UploadSingleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadSingleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadSingleButtonActionPerformed

    private void CrearSingleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearSingleButtonMouseClicked
        CreateSongFrame.setModal(true);
        CreateSongFrame.pack();
        CreateSongFrame.setLocationRelativeTo(this);
        CreateSongFrame.setVisible(true);
    }//GEN-LAST:event_CrearSingleButtonMouseClicked

    private void tf_SongTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_SongTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_SongTituloActionPerformed

    private void CrearSongButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearSongButtonMouseClicked
        
        int cont = 0;
        int limit = 0;
        
        while (cont <= limit) {
            Cancion Song = new Cancion(tf_SongTitulo.getText(), Double.parseDouble(tf_SongDuracion.getText()), null);
            Single NewLan = new Single(Song, tf_SingleTitulo.getText(), SingleFechaChooser.getDate(), 0);
            NewLan.getInSingle().setReferencia(NewLan);

            JOptionPane.showMessageDialog(this, "Single & Cancion Creados");

            CreateSongFrame.setModal(false);
            CreateSongFrame.setVisible(false);
            UploadSingleFrame.setModal(false);
            UploadSingleFrame.setVisible(false);

            ((Artista) Current).Releases.add(NewLan);
            ((Artista) Current).Uploads.add(Song);

            tf_SongTitulo.setText("");
            tf_SongDuracion.setText("");
            tf_SingleTitulo.setText("");
            SingleFechaChooser.setDate(null);
        }
    }//GEN-LAST:event_CrearSongButtonMouseClicked

    private void CrearSingleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearSingleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearSingleButtonActionPerformed

    private void CrearAlbumButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearAlbumButtonMouseClicked
        CreateSongFrame.setModal(true);
        CreateSongFrame.pack();
        CreateSongFrame.setLocationRelativeTo(this);
        CreateSongFrame.setVisible(true);
    }//GEN-LAST:event_CrearAlbumButtonMouseClicked

    private void CrearAlbumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAlbumButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearAlbumButtonActionPerformed

    private void UploadAlbumButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadAlbumButtonMouseClicked
        UploadAlbumFrame.setModal(true);
        UploadAlbumFrame.pack();
        UploadAlbumFrame.setLocationRelativeTo(this);
        UploadAlbumFrame.setVisible(true);
    }//GEN-LAST:event_UploadAlbumButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlbumFecha;
    private com.toedter.calendar.JDateChooser AlbumFechaChooser;
    private javax.swing.JLabel AlbumTitle;
    private javax.swing.JTree ArtistTree;
    private javax.swing.JScrollPane ArtistTreeScrollPane;
    private javax.swing.JDialog ArtistWindow;
    private javax.swing.JButton CrearAlbumButton;
    private javax.swing.JButton CrearSingleButton;
    private javax.swing.JButton CrearSongButton;
    private javax.swing.JLabel CreateSong;
    private javax.swing.JDialog CreateSongFrame;
    private javax.swing.JLabel CuentaCanciones;
    private javax.swing.JLabel Edad;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel NombreArtistico;
    private javax.swing.JLabel Password;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel SignUpTitle;
    private javax.swing.JLabel SingleFecha;
    private com.toedter.calendar.JDateChooser SingleFechaChooser;
    private javax.swing.JLabel SingleTitle;
    private javax.swing.JLabel SongDuracion;
    private javax.swing.JLabel SongTitulo;
    private javax.swing.JRadioButton Spotify;
    private javax.swing.JRadioButton SpotifyArtists;
    private javax.swing.JLabel SpotifyForArtists;
    private javax.swing.JLabel SpotifyForClients;
    private javax.swing.ButtonGroup SpotifyType;
    private javax.swing.JLabel UploadAlbum;
    private javax.swing.JButton UploadAlbumButton;
    private javax.swing.JDialog UploadAlbumFrame;
    private javax.swing.JLabel UploadSingle;
    private javax.swing.JButton UploadSingleButton;
    private javax.swing.JDialog UploadSingleFrame;
    private javax.swing.JDialog UserWindow;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField tf_AlbumTitulo;
    private javax.swing.JTextField tf_CuentaCanciones;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_NombreArtistico;
    private javax.swing.JTextField tf_Password;
    private javax.swing.JTextField tf_SingleTitulo;
    private javax.swing.JTextField tf_SongDuracion;
    private javax.swing.JTextField tf_SongTitulo;
    private javax.swing.JTextField tf_Username;
    // End of variables declaration//GEN-END:variables
    public ArrayList<Usuario> AllUsers = new ArrayList();

}
