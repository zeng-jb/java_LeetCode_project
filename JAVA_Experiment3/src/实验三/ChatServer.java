package 实验三;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChatServer {

    public static void main(String[] args) {

        Scanner inputStream = null;
        PrintWriter outputStream = null;
        Scanner sc = new Scanner(System.in);   //服务器聊天输入
        String s = null;

        try {
            //服务器可以通过命令行参数指定侦听端口 默认是8899
            ServerSocket ChatServer = new ServerSocket((args.length > 0) ? Integer.parseInt(args[0]) : 8899);
            System.out.println("------Waiting for connection------");
            Socket ChatClient = ChatServer.accept();
            //连接成功,创建流
            System.out.println("The connection was successful");

            inputStream = new Scanner(new InputStreamReader(ChatClient.getInputStream()));
            outputStream = new PrintWriter(new DataOutputStream(ChatClient.getOutputStream()));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            boolean flag = true;   //判断退出标志
            while (flag) {
                s = inputStream.nextLine();
                String time = sdf.format(new Date());
                System.out.println("Client(" + time + "): " + s);
                if ("BYE".equals(s)) {
                    flag = false;
                    outputStream.println("BYE BYE~");
                } else {
                    s = sc.nextLine(); //从键盘读入
                    outputStream.println(s);
                }
                outputStream.flush(); //清空缓冲区的数据流
            }
        } catch (NumberFormatException e) {
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