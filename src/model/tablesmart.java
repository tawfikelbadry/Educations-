/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author tito
 */
public class tablesmart {

    public void setTableAlignment(JTable model) {
        model.getTableHeader().setFont(new Font("Sakkal Majalla", Font.BOLD, 25));
        TableCellRenderer rendererFromHeader = model.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
// table header alignment
        JTableHeader header = model.getTableHeader();
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) model.getTableHeader().getDefaultRenderer();
        header.setDefaultRenderer(renderer);
        renderer.setHorizontalAlignment(JLabel.CENTER);

// table content alignment
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        int rowNumber = model.getColumnCount();
        for (int i = 0; i < rowNumber; i++) {
            model.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            model.setRowHeight(30);
            model.setFont(new Font("Tahoma", 0, 20));
            model.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        model.getColumnModel().getColumn(0).setPreferredWidth(50);
        model.getColumnModel().getColumn(1).setPreferredWidth(250);
        model.getColumnModel().getColumn(2).setPreferredWidth(300);
        model.getColumnModel().getColumn(3).setPreferredWidth(150);
        model.getColumnModel().getColumn(4).setPreferredWidth(150);

    }
    
    
    
        public void setItemsTableAlignment(JTable model) {
        model.getTableHeader().setFont(new Font("Sakkal Majalla", Font.BOLD, 25));
        TableCellRenderer rendererFromHeader = model.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
// table header alignment
        JTableHeader header = model.getTableHeader();
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) model.getTableHeader().getDefaultRenderer();
        header.setDefaultRenderer(renderer);
        renderer.setHorizontalAlignment(JLabel.CENTER);

// table content alignment
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        int rowNumber = model.getColumnCount();
        for (int i = 0; i < rowNumber; i++) {
            model.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            model.setRowHeight(30);
            model.setFont(new Font("Tahoma", 0, 20));
            model.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

//        model.getColumnModel().getColumn(0).setPreferredWidth(50);
//        model.getColumnModel().getColumn(1).setPreferredWidth(250);
//        model.getColumnModel().getColumn(2).setPreferredWidth(300);
//        model.getColumnModel().getColumn(3).setPreferredWidth(150);
//        model.getColumnModel().getColumn(4).setPreferredWidth(150);

    }
    
    
    
    
    
    
    

}
