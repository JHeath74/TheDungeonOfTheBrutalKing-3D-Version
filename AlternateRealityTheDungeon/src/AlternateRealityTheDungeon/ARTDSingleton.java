package AlternateRealityTheDungeon;

import java.util.ArrayList;
import java.util.List;

import ARTDArmour.ARTDBreastPlate;
import ARTDArmour.ARTDChain;
import ARTDArmour.ARTDCloth;
import ARTDArmour.ARTDLeather;
import ARTDArmour.ARTDPlate;
import ARTDArmour.ARTDSkin;
import ARTDArmour.ARTDStuddedLeather;

import ARTDEnemies.ARTDRats;
import ARTDEnemies.ARTDSkeletons;
import ARTDEnemies.ARTDSpiders;

import ARTDWeapons.ARTDBattleAxe;
import ARTDWeapons.ARTDBattleHammer;
import ARTDWeapons.ARTDClub;
import ARTDWeapons.ARTDCrossbow;
import ARTDWeapons.ARTDDaggger;
import ARTDWeapons.ARTDDart;
import ARTDWeapons.ARTDFlail;
import ARTDWeapons.ARTDHand;
import ARTDWeapons.ARTDJavelin;
import ARTDWeapons.ARTDLongSword;
import ARTDWeapons.ARTDLongbow;
import ARTDWeapons.ARTDShortSword;
import ARTDWeapons.ARTDShortbow;
import ARTDWeapons.ARTDSling;
import ARTDWeapons.ARTDStilleto;
import ARTDWeapons.ARTDSword;
import ARTDWeapons.ARTDWarNet;
import ARTDWeapons.ARTDWhip;

public class ARTDSingleton 
{

	private static ARTDCharecter myChar = ARTDCharecter.Singleton();
	
	private static ARTDWeapons myWeapon = ARTDWeapons.Singleton();
	private static ARTDArmour myArmour = ARTDArmour.Singleton();
	private static ARTDSpells mySpells = ARTDSpells.Singleton();
	
	
	private static List<ARTDArmour> armourList = addArmour();
	private static List<ARTDEnemies> monsterList = addEnemies();
	private static List<ARTDWeapons> weaponList = addWeapon();
	private static List<ARTDSpells> spellList = addSpells();
	
	//Singletons
	
	public static ARTDCharecter myCharSingleton()
	{
		return myChar;
	}
	
	public static ARTDWeapons myWeaponSingleton()
	{
		return myWeapon;
	}
	
	public static ARTDArmour myArmourSingleton()
	{
		return myArmour;
	}
	
	public static ARTDSpells mySpellsSingleton()
	{
		return mySpells;
	}
	
	//Return Arrays that stores the armour, weapons, spells and enemies
	
	
	public static List<ARTDArmour> armourList()
	{
		return armourList;
	}
	
	public static List<ARTDEnemies> monsterList()
	{
		
		return monsterList;
		
	}
	
	public static List<ARTDWeapons> weaponsList()
	{
		return weaponList;
		
	}
	
	public static List<ARTDSpells> spellList()
	{
		return spellList;
		
	}
	
	//Adding Spells, Enemies, Weapons and Armour to Arrays
	
	private static List<ARTDEnemies> addEnemies()
	{
		monsterList = new ArrayList<ARTDEnemies>();
		
		monsterList.add(new ARTDRats());
		monsterList.add(new ARTDSkeletons());
		monsterList.add(new ARTDSpiders());
		return monsterList;
	}
	
	private static List<ARTDArmour> addArmour()
	{
		armourList = new ArrayList<ARTDArmour>();	
		
		  armourList.add(new ARTDSkin());
		  armourList.add(new ARTDCloth());
		  armourList.add(new ARTDLeather());
		  armourList.add(new ARTDStuddedLeather());
		  armourList.add(new ARTDChain());
		  armourList.add(new ARTDBreastPlate());
		  armourList.add(new ARTDPlate());
		
		return armourList;
		
	}
	
	private static List<ARTDWeapons> addWeapon()
	{
		weaponList = new ArrayList<ARTDWeapons>();
		
		weaponList.add(new ARTDHand());
		weaponList.add(new ARTDDaggger());
		weaponList.add(new ARTDStilleto());
		weaponList.add(new ARTDDart());
		weaponList.add(new ARTDSling());
		weaponList.add(new ARTDShortSword());
		weaponList.add(new ARTDShortbow());
		weaponList.add(new ARTDWarNet());
		weaponList.add(new ARTDFlail());
		weaponList.add(new ARTDSword());
		weaponList.add(new ARTDWhip());
		weaponList.add(new ARTDCrossbow());
		weaponList.add(new ARTDLongSword());
		weaponList.add(new ARTDLongbow());
		weaponList.add(new ARTDJavelin());
		weaponList.add(new ARTDBattleAxe());
		weaponList.add(new ARTDBattleHammer());
		
		
		return weaponList;
		
	}
	
	private static List<ARTDSpells> addSpells()
	{
		spellList = new ArrayList<ARTDSpells>();
		
		return spellList;
		
	}
	
}
