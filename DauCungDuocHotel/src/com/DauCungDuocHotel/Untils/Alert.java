package com.DauCungDuocHotel.Untils;

import com.DauCungDuocHotel.UI.MainJFrame;
import component.notification.Notification;
import component.confirm.ConfirmJDialog;

import javax.swing.*;
import java.awt.*;
//xs
public class Alert {
    public static void success(Frame frame, String msg) {
        Notification n =
                new Notification(
                        frame,
                        Notification.Type.SUCCESS ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void success(String msg) {
        Notification n =
                new Notification(
                        MainJFrame.getFrames()[MainJFrame.getFrames().length - 1],
                        Notification.Type.SUCCESS ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void info(Frame frame, String msg) {
        Notification n =
                new Notification(
                        frame,
                        Notification.Type.INFO ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void info(String msg) {
        Notification n =
                new Notification(
                        MainJFrame.getFrames()[MainJFrame.getFrames().length - 1],
                        Notification.Type.INFO ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void warning(Frame frame, String msg) {
        Notification n =
                new Notification(
                        frame,
                        Notification.Type.WARNING ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void warning(String msg) {
        Notification n =
                new Notification(
                        MainJFrame.getFrames()[MainJFrame.getFrames().length - 1],
                        Notification.Type.WARNING ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void error(Frame frame, String msg) {
        Notification n =
                new Notification(
                        frame,
                        Notification.Type.ERROR ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static void error(String msg) {
        Notification n =
                new Notification(
                        MainJFrame.getFrames()[MainJFrame.getFrames().length - 1],
                        Notification.Type.ERROR ,
                        Notification.Location.TOP_RIGHT,
                        msg
                );
        n.showNotification();
    }

    public static boolean confirm(String title, String msg, JFrame jFrame) {
        ConfirmJDialog cd = new ConfirmJDialog(jFrame);
        cd.showMessage(title, msg);
        return cd.getMessageType() == ConfirmJDialog.MessageType.OK;
    }
}
