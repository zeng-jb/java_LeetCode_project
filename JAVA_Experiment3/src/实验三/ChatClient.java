package 实验三;

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
        Scanner sc = new Scanner(System.in);   //客户端聊天输入
        String s = null;

        try {
            //客户机通过命令行参数指定服务器的IP地址和端口,否则默认本机和服务器端口
            Socket ChatClient = (args.length > 0 ? new Socket(args[0], Integer.parseInt(args[1])) : new Socket("localhost", 8899));
            //创建流
            inputStream = new Scanner(new InputStreamReader(ChatClient.getInputStream()));
            outputStream = new PrintWriter(new DataOutputStream(ChatClient.getOutputStream()));

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            boolean flag = true;   //判断退出标志

            while (flag) {
                s = sc.nextLine();    //从键盘读入
                outputStream.println(s);
                outputStream.flush(); //清空缓冲区的数据流
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