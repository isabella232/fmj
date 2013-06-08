/*
 * TrackControlPanel.java
 *
 * Created on June 14, 2007, 4:57 PM
 */

package net.sf.fmj.ui.wizards;

/**
 *
 * @author Ken Larson
 */
public class TrackControlPanel extends javax.swing.JPanel
{
    private AudioFormatPanel audioFormatPanel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxEnableTrack;
    private javax.swing.JPanel panelFormat;

    // public javax.swing.JPanel getPanelFormat()
    // {
    // return panelFormat;
    // }

    /** Creates new form TrackControlPanel */
    public TrackControlPanel()
    {
        initComponents();
    }

    public AudioFormatPanel getAudioFormatPanel()
    {
        return audioFormatPanel;
    }

    // End of variables declaration//GEN-END:variables
    public javax.swing.JCheckBox getCheckBoxEnableTrack()
    {
        return checkBoxEnableTrack;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed"
    // desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        checkBoxEnableTrack = new javax.swing.JCheckBox();
        panelFormat = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        checkBoxEnableTrack.setText("Enable track");
        checkBoxEnableTrack.setBorder(javax.swing.BorderFactory
                .createEmptyBorder(0, 0, 0, 0));
        checkBoxEnableTrack.setMargin(new java.awt.Insets(0, 0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(checkBoxEnableTrack, gridBagConstraints);

        panelFormat.setLayout(new java.awt.GridBagLayout());

        panelFormat.setBorder(javax.swing.BorderFactory
                .createTitledBorder("Format"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(panelFormat, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents

    public void setAudioFormatPanel(AudioFormatPanel audioFormatPanel)
    {
        this.audioFormatPanel = audioFormatPanel;
        panelFormat.add(audioFormatPanel);
    }

}
