package com.neuedu.chapter07.��װ.��ϰ;

public class PlayersTest {

	public static void main(String[] args) {
		
		//���һ֧��ӣ���Ҫ��Ա11��
		Players[] team = new Players[11];
		
		int i = 0;
		while(true)
		{
			//������Ա
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
