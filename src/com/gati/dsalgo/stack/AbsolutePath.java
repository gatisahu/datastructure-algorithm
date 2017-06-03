/**
 * 
 */
package com.gati.dsalgo.stack;

import java.util.Stack;

/**
 * @author sahug
 *
 */
public class AbsolutePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbsolutePath absolutePath =new AbsolutePath();
		/*String path ="/a/./b/../../c/";
		System.out.println(absolutePath.simplifyPath(path));
		String path2="/home//foo/";
		System.out.println(absolutePath.simplifyPath(path2));*/
		String path3="/./.././ykt/xhp/nka/eyo/blr/emm/xxm/fuv/bjg/./qbd/./../pir/dhu/./../../wrm/grm/ach/jsy/dic/ggz/smq/mhl/./../yte/hou/ucd/vnn/fpf/cnb/ouf/hqq/upz/akr/./pzo/../llb/./tud/olc/zns/fiv/./eeu/fex/rhi/pnm/../../kke/./eng/bow/uvz/jmz/hwb/./././ids/dwj/aqu/erf/./koz/..";
		System.out.println(absolutePath.simplifyPath(path3));
	}
	public String simplifyPath(String a) {
		Stack<String> stack =new Stack<>();
		String[] pathToken=a.split("/");
		for(int i=1;i<pathToken.length;i++){
			if(pathToken[i].equals(".")||pathToken[i].equals("")){
				continue;
			}else if( pathToken[i].equals("..")){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}else {
				stack.push(pathToken[i]);
			}
		}
		String result="";
		if(!stack.isEmpty()){
		 result =stack.pop();
		}
		while(!stack.isEmpty()){
			String str=stack.pop();
			
			result=str+"/"+result;
		}
		
		return "/"+result;
	}
}
