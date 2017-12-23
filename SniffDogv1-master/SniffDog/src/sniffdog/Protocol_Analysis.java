/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sniffdog;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import org.jnetpcap.Pcap;
import org.jnetpcap.packet.JScanner;
import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.packet.PcapPacketHandler;
import org.jnetpcap.protocol.lan.Ethernet;
import org.jnetpcap.protocol.network.Arp;
import org.jnetpcap.protocol.network.Icmp;
import org.jnetpcap.protocol.network.Ip4;
import org.jnetpcap.protocol.network.Ip6;
import org.jnetpcap.protocol.tcpip.Http;
import org.jnetpcap.protocol.tcpip.Tcp;
import org.jnetpcap.protocol.tcpip.Udp;
import org.jnetpcap.protocol.wan.PPP;

/**
 *
 * @author Rishabh
 */
public class Protocol_Analysis extends javax.swing.JFrame {

    /**
     * Creates new form Protocol_Analysis
     */
    public Protocol_Analysis() {
        initComponents();
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                extract_info();
                setspinner();
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Protocol Analysis");
        setMinimumSize(new java.awt.Dimension(509, 385));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(290, 10, 40, 30);

        jLabel1.setText("Total Packets");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 70, 14);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 20, 80, 20);

        jLabel3.setText("Packet No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 20, 52, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 210, 350, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TCP");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(130, 30, 50, 14);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("IP4");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 30, 50, 14);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ARP");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(430, 30, 50, 14);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ICMP");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(370, 30, 50, 14);

        jLabel8.setBackground(java.awt.Color.gray);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(130, 50, 50, 30);
        jLabel8.getAccessibleContext().setAccessibleName("tcplabel");

        jLabel9.setBackground(java.awt.Color.gray);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(190, 50, 50, 30);
        jLabel9.getAccessibleContext().setAccessibleName("udplabel");

        jLabel10.setBackground(java.awt.Color.gray);
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(250, 50, 50, 30);
        jLabel10.getAccessibleContext().setAccessibleName("ip4label");

        jLabel11.setBackground(java.awt.Color.gray);
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(200, 40, 0, 0);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("UDP");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(190, 30, 50, 14);

        jLabel13.setBackground(java.awt.Color.gray);
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(370, 50, 50, 30);
        jLabel13.getAccessibleContext().setAccessibleName("icmplabel");

        jLabel14.setBackground(java.awt.Color.gray);
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(430, 50, 50, 30);
        jLabel14.getAccessibleContext().setAccessibleName("arplabel");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("IP6");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(310, 30, 50, 14);

        jLabel16.setBackground(java.awt.Color.gray);
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16);
        jLabel16.setBounds(310, 50, 50, 30);
        jLabel16.getAccessibleContext().setAccessibleName("ip6label");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PPP");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(490, 30, 50, 14);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ETH");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(550, 30, 50, 14);

        jLabel19.setBackground(java.awt.Color.gray);
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(490, 50, 50, 30);
        jLabel19.getAccessibleContext().setAccessibleName("ppplabel");

        jLabel20.setBackground(java.awt.Color.gray);
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20);
        jLabel20.setBounds(550, 50, 50, 30);
        jLabel20.getAccessibleContext().setAccessibleName("ethlabel");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("HTTP");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(10, 30, 50, 14);

        jLabel22.setBackground(java.awt.Color.gray);
        jLabel22.setEnabled(false);
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22);
        jLabel22.setBounds(10, 50, 50, 30);
        jLabel22.getAccessibleContext().setAccessibleName("httplabel");

        jLabel23.setBackground(java.awt.Color.gray);
        jLabel23.setEnabled(false);
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23);
        jLabel23.setBounds(70, 50, 50, 30);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("HTTPS");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(71, 30, 50, 14);

        jLabel25.setText("Secured?");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(40, 10, 50, 14);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 270, 610, 100);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 350, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int x = (int) jSpinner1.getValue();
        if (hm.get(x).tcp == 1) {
            jLabel8.setBackground(Color.GREEN);
            jLabel8.setEnabled(true);
        } else {
            jLabel8.setBackground(Color.gray);
            jLabel8.setEnabled(false);
        }
        if (hm.get(x).https == 1) {
            jLabel23.setBackground(Color.GREEN);
            //jLabel23.setEnabled(true);
        } else {
            jLabel23.setBackground(Color.gray);
            //jLabel23.setEnabled(false);
        }
        if (hm.get(x).udp == 1) {
            jLabel9.setBackground(Color.GREEN);
            jLabel9.setEnabled(true);
        } else {
            jLabel9.setBackground(Color.gray);
            jLabel9.setEnabled(false);
        }
        if (hm.get(x).http == 1) {
            jLabel22.setBackground(Color.GREEN);
         //   jLabel22.setEnabled(true);
        } else {
            jLabel22.setBackground(Color.gray);
           // jLabel22.setEnabled(false);
        }
        
        if (hm.get(x).ip4 == 1) {
            jLabel10.setBackground(Color.GREEN);
            jLabel10.setEnabled(true);
        } else {
            jLabel10.setBackground(Color.gray);
            jLabel10.setEnabled(false);
        }
        if (hm.get(x).ip6 == 1) {
            jLabel16.setBackground(Color.GREEN);
            jLabel16.setEnabled(true);
        } else {
            jLabel16.setBackground(Color.gray);
            jLabel16.setEnabled(false);
        }
        if (hm.get(x).icmp == 1) {
            jLabel13.setBackground(Color.GREEN);
            jLabel13.setEnabled(true);
        } else {
            jLabel13.setBackground(Color.gray);
            jLabel13.setEnabled(false);
        }
        if (hm.get(x).arp == 1) {
            jLabel14.setBackground(Color.GREEN);
            jLabel14.setEnabled(true);
        } else {
            jLabel14.setBackground(Color.gray);
            jLabel14.setEnabled(false);
        }
        
        if (hm.get(x).ppp == 1) {
            jLabel19.setBackground(Color.GREEN);
            jLabel19.setEnabled(true);
        } else {
            jLabel19.setBackground(Color.gray);
            jLabel19.setEnabled(false);
        }
        if (hm.get(x).eth == 1) {
            jLabel20.setBackground(Color.GREEN);
            jLabel20.setEnabled(true);
        } else {
            jLabel20.setBackground(Color.gray);
            jLabel20.setEnabled(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
                  jTextArea1.setText("Dooh...It only tells about security");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Tcp());
        } catch (Exception e) {
            jTextArea1.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Udp());
        } catch (Exception e) {
            jTextArea1.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Ip4());
        } catch (Exception e) {
            jTextArea1.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Ip6());
        } catch (Exception e) {
            jTextArea1.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Icmp());
        } catch (Exception e) {
            jTextArea1.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Arp());
        } catch (Exception e) {
            jTextArea1.setText("");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new PPP());
        } catch (Exception e) {
            jTextArea1.setText("");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        try {
            up.display_info((int) jSpinner1.getValue(), new Ethernet());
        } catch (Exception e) {
            jTextArea1.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
     jTextArea1.setText("Dooh..It only tells security..");   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

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
            java.util.logging.Logger.getLogger(Protocol_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Protocol_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Protocol_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Protocol_Analysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Protocol_Analysis().setVisible(true);
            }
        });
    }
    UI_Processing up;

    private void extract_info() {
        up = new UI_Processing(jTextArea1);
        String addr = "C:\\Users\\Rishabh\\Downloads\\NetworkAnal\\" + User_Interface.filename + ".pcap";
        
        Pcap pcap
                = Pcap.openOffline(addr, new StringBuilder());
        
        PcapPacketHandler<String> jpacketHandler = new handler_protocol();
        JScanner.getThreadLocal().setFrameNumber(0);
        pcap.loop(-1, jpacketHandler, "jNetPcap rocks!");
        
        pcap.close();
        
    }
    int totalpackets = 0;
    
    static class node {
        
        int http, https, tcp, udp, ip4, ip6, icmp, arp, ppp, eth;
        
        public node(int http, int https, int tcp, int udp, int ip4, int ip6, int icmp, int arp, int ppp, int eth) {
            this.http = http;
            this.https = https;
            this.arp = arp;
            this.tcp = tcp;
            this.ip4 = ip4;
            this.ip6 = ip6;
            this.icmp = icmp;
            this.ppp = ppp;
            this.eth = eth;
            this.udp = udp;
        }
    }
    HashMap<Integer, node> hm = new HashMap<Integer, node>();
    
    private class handler_protocol implements PcapPacketHandler<String> {
        
        int num = 0;
        
        Tcp tcp = new Tcp();
        Arp arp = new Arp();
        
        PPP ppp = new PPP();
        Ethernet eth = new Ethernet();
        Udp udp = new Udp();
        Icmp icmp = new Icmp();
        Ip4 ip4 = new Ip4();
        Ip6 ip6 = new Ip6();
        //Http http = new Http();
        
        public void nextPacket(final PcapPacket packet, String user) {
            num++;
            int tcpf = 0, ip4f = 0, arpf = 0, ip6f = 0, httpf = 0, icmpf = 0, ethf = 0, pppf = 0, udpf = 0, httpsf = 0;
            if (packet.hasHeader(tcp)) {
                tcpf = 1;
                if (tcp.destination() == 443 || tcp.source() == 443) {
                    httpsf = 1;
                }
                if (tcp.destination() == 80 || tcp.source() == 80) {
                    httpf = 1;
                }
                
            }
            if (packet.hasHeader(ip4)) {
                ip4f = 1;
            }
            if (packet.hasHeader(arp)) {
                arpf = 1;
            }
            if (packet.hasHeader(ip6)) {
                ip6f = 1;
            }
            /*if (packet.hasHeader(http)) {
                httpf = 1;
            }*/
            if (packet.hasHeader(icmp)) {
                icmpf = 1;
            }
            if (packet.hasHeader(ppp)) {
                pppf = 1;
            }
            if (packet.hasHeader(eth)) {
                ethf = 1;
            }
            if (packet.hasHeader(udp)) {
                udpf = 1;
            }
            
            hm.put(num, new node(httpf, httpsf, tcpf, udpf, ip4f, ip6f, icmpf, arpf, pppf, ethf));
            totalpackets = num;
        }
        
    }
    
    void setspinner() {
        jLabel2.setText(totalpackets + "");
        SpinnerNumberModel snm = new SpinnerNumberModel(1, 1, totalpackets, 1);
        jSpinner1.setModel(snm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}