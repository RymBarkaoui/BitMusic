/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.hmi.modules.connection;

import bitmusic.hmi.patterns.AbstractController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hebergui, unkedeuxke
 */
public final class ConnectionController extends AbstractController<ConnectionModel, ConnectionView> {

    public ConnectionController(final ConnectionModel model, final ConnectionView view) {
        super(model, view);
    }

    public class ConnectionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("---- Clic sur le bouton Connection");

            ConnectionModel model = ConnectionController.this.getModel();
            // TODO : implémenter la logique (appels aux méthodes du Model, ex : model.method())
        }
    }

    public class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("---- Clic sur le bouton Reset");

            ConnectionModel model = ConnectionController.this.getModel();
            // TODO : implémenter la logique (appels aux méthodes du Model, ex : model.method())
        }
    }

    public class CreateNewUserListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("---- Clic sur le bouton CreateNewUser");
            
            ConnectionModel model = ConnectionController.this.getModel();
            // TODO : implémenter la logique (appels aux méthodes du Model, ex : model.method())
        }
    }
}
