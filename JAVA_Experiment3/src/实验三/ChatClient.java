package ʵ����;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        Scanner inputStream = null;
        PrintWriter outputStream = null;
        Scanner sc = new Scanner(System.in);   //�ͻ�����������
        String s = null;

        try {
            //�ͻ���ͨ�������в���ָ����������IP��ַ�Ͷ˿�,����Ĭ�ϱ����ͷ������˿�
            Socket ChatClient = (args.length > 0 ? new Socket(args[0], Integer.parseInt(args[1])) : new Socket("localhost", 8899));
            //������
            inputStream = new Scanner(new InputStreamReader(ChatClient.getInputStream()));
            outputStream = new PrintWriter(new DataOutputStream(ChatClient.getOutputStream()));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            boolean flag = true;   //�ж��˳���־

            while (flag) {
                s = sc.nextLine();    //�Ӽ��̶���
                outputStream.println(s);
                outputStream.flush(); //��ջ�������������
                s = inputStream.nextLine();
                if ("BYE BYE~".equals(s)) {
                    flag = false;
                }
                String time = sdf.format(new Date());
                System.out.println("Server(" + time + "): " + s);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                inputStream.close();
            if (outputStream != null)
                outputStream.close();
        }
    }
}