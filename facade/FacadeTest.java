package com.company.design.facade;

public class FacadeTest {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileConnect();
        ftpClient.disConnect();
        System.out.println("----------------------");
        //facade 객체 생성
        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
