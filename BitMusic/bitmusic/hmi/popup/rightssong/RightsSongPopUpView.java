/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.hmi.popup.rightssong;

import bitmusic.hmi.patterns.AbstractView;

/**
 *
 * @author unkedeuxke
 */
public final class RightsSongPopUpView extends AbstractView<RightsSongPopUpController> {

    private static final String type = "POPUP";

    public RightsSongPopUpView() {
        super();
    }

    @Override
    public void initPanel() {
        System.out.println("--- RightsSongPopUpView.initPanel()");

        // TODO
    }

    @Override
    public String getType() {
        return type;
    }

}