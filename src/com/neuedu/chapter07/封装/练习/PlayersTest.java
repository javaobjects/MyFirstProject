package com.neuedu.chapter07.封装.练习;

public class PlayersTest {

	public static void main(String[] args) {
		
		//组件一支球队，需要球员11名
		Players[] team = new Players[11];
		
		int i = 0;
		while(true)
		{
			//创建球员
			Players players = Players.create();
			if(players == null)
			{
				break;
			}
			else
			{
				team[i] = players;
				i++;
			}
		}
	}
}
