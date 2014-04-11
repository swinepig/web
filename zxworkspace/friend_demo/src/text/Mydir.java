package text;

import java.io.File;
import java.util.Date;

public class Mydir {

	public static void main(String[] args) {
			File f=null;
			if(args.length>0){
				f=new File(args[0]);
			}else{
				 f = new File("WebRoot/upload");//表示当前目录
				// f.mkdir();
			}
			
		if(f.isDirectory()){
				System.out.println(f.getAbsolutePath()+"下的文件和子目录列表");
			}
			
			int dirNum=0,fileNum=0;
			File[] fs=f.listFiles();// 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
			for (int i=0;i<fs.length;i++){
				System.out.print(new Date(fs[i].lastModified())+"\t");
				if(fs[i].isDirectory()){
					System.out.print("目录\t");
					dirNum++;
				}else{
					System.out.print("文件长度  "+fs[i].length()+'\t');
					fileNum++;
				}
				System.out.println("名称"+fs[i].getName());
			}
			System.out.println("文件数"+fileNum);
			System.out.println("目录数"+dirNum);
	}

}
