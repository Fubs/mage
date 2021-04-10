package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class Commander2021Edition extends ExpansionSet {

    private static final Commander2021Edition instance = new Commander2021Edition();

    public static Commander2021Edition getInstance() {
        return instance;
    }

    private Commander2021Edition() {
        super("Commander 2021 Edition", "C21", ExpansionSet.buildDate(2021, 4, 23), SetType.SUPPLEMENTAL);
        this.blockName = "Command Zone";
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Adrix and Nev, Twincasters", 9, Rarity.MYTHIC, mage.cards.a.AdrixAndNevTwincasters.class));
        cards.add(new SetCardInfo("Aether Gale", 113, Rarity.RARE, mage.cards.a.AetherGale.class));
        cards.add(new SetCardInfo("Aetherspouts", 114, Rarity.RARE, mage.cards.a.Aetherspouts.class));
        cards.add(new SetCardInfo("Ancient Den", 276, Rarity.COMMON, mage.cards.a.AncientDen.class));
        cards.add(new SetCardInfo("Angel of Serenity", 83, Rarity.MYTHIC, mage.cards.a.AngelOfSerenity.class));
        cards.add(new SetCardInfo("Angel of the Ruins", 11, Rarity.RARE, mage.cards.a.AngelOfTheRuins.class));
        cards.add(new SetCardInfo("Apex of Power", 158, Rarity.MYTHIC, mage.cards.a.ApexOfPower.class));
        cards.add(new SetCardInfo("Arashi, the Sky Asunder", 185, Rarity.RARE, mage.cards.a.ArashiTheSkyAsunder.class));
        cards.add(new SetCardInfo("Arcane Signet", 234, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archaeomancer's Map", 12, Rarity.RARE, mage.cards.a.ArchaeomancersMap.class));
        cards.add(new SetCardInfo("Audacious Reshapers", 47, Rarity.RARE, mage.cards.a.AudaciousReshapers.class));
        cards.add(new SetCardInfo("Barren Moor", 277, Rarity.UNCOMMON, mage.cards.b.BarrenMoor.class));
        cards.add(new SetCardInfo("Battlefield Forge", 278, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Beast Within", 186, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Biomass Mutation", 209, Rarity.RARE, mage.cards.b.BiomassMutation.class));
        cards.add(new SetCardInfo("Blasphemous Act", 159, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Blighted Cataract", 279, Rarity.UNCOMMON, mage.cards.b.BlightedCataract.class));
        cards.add(new SetCardInfo("Bloodthirsty Blade", 235, Rarity.UNCOMMON, mage.cards.b.BloodthirstyBlade.class));
        cards.add(new SetCardInfo("Bojuka Bog", 281, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Boreas Charger", 84, Rarity.RARE, mage.cards.b.BoreasCharger.class));
        cards.add(new SetCardInfo("Boros Charm", 210, Rarity.UNCOMMON, mage.cards.b.BorosCharm.class));
        cards.add(new SetCardInfo("Boros Garrison", 282, Rarity.UNCOMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Boros Locket", 236, Rarity.COMMON, mage.cards.b.BorosLocket.class));
        cards.add(new SetCardInfo("Bosh, Iron Golem", 237, Rarity.RARE, mage.cards.b.BoshIronGolem.class));
        cards.add(new SetCardInfo("Brainstorm", 115, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Brass's Bounty", 160, Rarity.RARE, mage.cards.b.BrasssBounty.class));
        cards.add(new SetCardInfo("Bronze Guardian", 13, Rarity.RARE, mage.cards.b.BronzeGuardian.class));
        cards.add(new SetCardInfo("Burnished Hart", 238, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Call the Skybreaker", 211, Rarity.RARE, mage.cards.c.CallTheSkybreaker.class));
        cards.add(new SetCardInfo("Caves of Koilos", 283, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Chain Reaction", 161, Rarity.RARE, mage.cards.c.ChainReaction.class));
        cards.add(new SetCardInfo("Champion of Wits", 116, Rarity.RARE, mage.cards.c.ChampionOfWits.class));
        cards.add(new SetCardInfo("Charmbreaker Devils", 162, Rarity.RARE, mage.cards.c.CharmbreakerDevils.class));
        cards.add(new SetCardInfo("Citadel Siege", 85, Rarity.RARE, mage.cards.c.CitadelSiege.class));
        cards.add(new SetCardInfo("Cleansing Nova", 86, Rarity.RARE, mage.cards.c.CleansingNova.class));
        cards.add(new SetCardInfo("Coiling Oracle", 212, Rarity.COMMON, mage.cards.c.CoilingOracle.class));
        cards.add(new SetCardInfo("Combustible Gearhulk", 163, Rarity.MYTHIC, mage.cards.c.CombustibleGearhulk.class));
        cards.add(new SetCardInfo("Commander's Sphere", 239, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Coveted Jewel", 240, Rarity.RARE, mage.cards.c.CovetedJewel.class));
        cards.add(new SetCardInfo("Crackling Drake", 213, Rarity.UNCOMMON, mage.cards.c.CracklingDrake.class));
        cards.add(new SetCardInfo("Crafty Cutpurse", 117, Rarity.RARE, mage.cards.c.CraftyCutpurse.class));
        cards.add(new SetCardInfo("Curiosity Crafter", 24, Rarity.RARE, mage.cards.c.CuriosityCrafter.class));
        cards.add(new SetCardInfo("Curse of Disturbance", 138, Rarity.UNCOMMON, mage.cards.c.CurseOfDisturbance.class));
        cards.add(new SetCardInfo("Curse of the Swine", 118, Rarity.RARE, mage.cards.c.CurseOfTheSwine.class));
        cards.add(new SetCardInfo("Daretti, Scrap Savant", 164, Rarity.MYTHIC, mage.cards.d.DarettiScrapSavant.class));
        cards.add(new SetCardInfo("Darksteel Citadel", 285, Rarity.UNCOMMON, mage.cards.d.DarksteelCitadel.class));
        cards.add(new SetCardInfo("Darksteel Mutation", 87, Rarity.UNCOMMON, mage.cards.d.DarksteelMutation.class));
        cards.add(new SetCardInfo("Deathbringer Liege", 214, Rarity.RARE, mage.cards.d.DeathbringerLiege.class));
        cards.add(new SetCardInfo("Deathbringer Regent", 141, Rarity.RARE, mage.cards.d.DeathbringerRegent.class));
        cards.add(new SetCardInfo("Debtors' Knell", 215, Rarity.RARE, mage.cards.d.DebtorsKnell.class));
        cards.add(new SetCardInfo("Deekah, Fractal Theorist", 26, Rarity.RARE, mage.cards.d.DeekahFractalTheorist.class));
        cards.add(new SetCardInfo("Desert of the Fervent", 286, Rarity.COMMON, mage.cards.d.DesertOfTheFervent.class));
        cards.add(new SetCardInfo("Desert of the Mindful", 287, Rarity.COMMON, mage.cards.d.DesertOfTheMindful.class));
        cards.add(new SetCardInfo("Desolation Twin", 82, Rarity.RARE, mage.cards.d.DesolationTwin.class));
        cards.add(new SetCardInfo("Dig Through Time", 119, Rarity.RARE, mage.cards.d.DigThroughTime.class));
        cards.add(new SetCardInfo("Digsite Engineer", 15, Rarity.RARE, mage.cards.d.DigsiteEngineer.class));
        cards.add(new SetCardInfo("Diluvian Primordial", 120, Rarity.RARE, mage.cards.d.DiluvianPrimordial.class));
        cards.add(new SetCardInfo("Dispatch", 88, Rarity.UNCOMMON, mage.cards.d.Dispatch.class));
        cards.add(new SetCardInfo("Dispeller's Capsule", 89, Rarity.COMMON, mage.cards.d.DispellersCapsule.class));
        cards.add(new SetCardInfo("Dualcaster Mage", 165, Rarity.RARE, mage.cards.d.DualcasterMage.class));
        cards.add(new SetCardInfo("Duelist's Heritage", 90, Rarity.RARE, mage.cards.d.DuelistsHeritage.class));
        cards.add(new SetCardInfo("Duplicant", 242, Rarity.RARE, mage.cards.d.Duplicant.class));
        cards.add(new SetCardInfo("Elite Scaleguard", 91, Rarity.UNCOMMON, mage.cards.e.EliteScaleguard.class));
        cards.add(new SetCardInfo("Epic Experiment", 216, Rarity.MYTHIC, mage.cards.e.EpicExperiment.class));
        cards.add(new SetCardInfo("Erratic Cyclops", 166, Rarity.RARE, mage.cards.e.ErraticCyclops.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 167, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Excavation Technique", 16, Rarity.RARE, mage.cards.e.ExcavationTechnique.class));
        cards.add(new SetCardInfo("Ezuri's Predation", 188, Rarity.RARE, mage.cards.e.EzurisPredation.class));
        cards.add(new SetCardInfo("Faithless Looting", 168, Rarity.COMMON, mage.cards.f.FaithlessLooting.class));
        cards.add(new SetCardInfo("Feldon of the Third Path", 169, Rarity.MYTHIC, mage.cards.f.FeldonOfTheThirdPath.class));
        cards.add(new SetCardInfo("Fiery Encore", 51, Rarity.RARE, mage.cards.f.FieryEncore.class));
        cards.add(new SetCardInfo("Fiery Fall", 170, Rarity.COMMON, mage.cards.f.FieryFall.class));
        cards.add(new SetCardInfo("Forgotten Ancient", 137, Rarity.RARE, mage.cards.f.ForgottenAncient.class));
        cards.add(new SetCardInfo("Garruk, Primal Hunter", 190, Rarity.MYTHIC, mage.cards.g.GarrukPrimalHunter.class));
        cards.add(new SetCardInfo("Ghostly Prison", 92, Rarity.UNCOMMON, mage.cards.g.GhostlyPrison.class));
        cards.add(new SetCardInfo("Gideon, Champion of Justice", 93, Rarity.MYTHIC, mage.cards.g.GideonChampionOfJustice.class));
        cards.add(new SetCardInfo("Great Furnace", 292, Rarity.COMMON, mage.cards.g.GreatFurnace.class));
        cards.add(new SetCardInfo("Guardian Augmenter", 62, Rarity.RARE, mage.cards.g.GuardianAugmenter.class));
        cards.add(new SetCardInfo("Hedron Archive", 244, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Hellkite Igniter", 171, Rarity.RARE, mage.cards.h.HellkiteIgniter.class));
        cards.add(new SetCardInfo("Hellkite Tyrant", 172, Rarity.MYTHIC, mage.cards.h.HellkiteTyrant.class));
        cards.add(new SetCardInfo("Hoard-Smelter Dragon", 173, Rarity.RARE, mage.cards.h.HoardSmelterDragon.class));
        cards.add(new SetCardInfo("Hornet Nest", 192, Rarity.RARE, mage.cards.h.HornetNest.class));
        cards.add(new SetCardInfo("Hornet Queen", 193, Rarity.RARE, mage.cards.h.HornetQueen.class));
        cards.add(new SetCardInfo("Humble Defector", 174, Rarity.UNCOMMON, mage.cards.h.HumbleDefector.class));
        cards.add(new SetCardInfo("Hunted Lammasu", 94, Rarity.RARE, mage.cards.h.HuntedLammasu.class));
        cards.add(new SetCardInfo("Hydra Broodmaster", 194, Rarity.RARE, mage.cards.h.HydraBroodmaster.class));
        cards.add(new SetCardInfo("Ichor Wellspring", 245, Rarity.COMMON, mage.cards.i.IchorWellspring.class));
        cards.add(new SetCardInfo("Idol of Oblivion", 246, Rarity.RARE, mage.cards.i.IdolOfOblivion.class));
        cards.add(new SetCardInfo("Incarnation Technique", 41, Rarity.RARE, mage.cards.i.IncarnationTechnique.class));
        cards.add(new SetCardInfo("Incubation Druid", 195, Rarity.RARE, mage.cards.i.IncubationDruid.class));
        cards.add(new SetCardInfo("Infernal Offering", 146, Rarity.RARE, mage.cards.i.InfernalOffering.class));
        cards.add(new SetCardInfo("Inferno Project", 52, Rarity.RARE, mage.cards.i.InfernoProject.class));
        cards.add(new SetCardInfo("Inspiring Refrain", 27, Rarity.RARE, mage.cards.i.InspiringRefrain.class));
        cards.add(new SetCardInfo("Izzet Boilerworks", 294, Rarity.UNCOMMON, mage.cards.i.IzzetBoilerworks.class));
        cards.add(new SetCardInfo("Izzet Signet", 247, Rarity.COMMON, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Jaya Ballard", 175, Rarity.MYTHIC, mage.cards.j.JayaBallard.class));
        cards.add(new SetCardInfo("Jor Kadeen, the Prevailer", 220, Rarity.RARE, mage.cards.j.JorKadeenThePrevailer.class));
        cards.add(new SetCardInfo("Kaseto, Orochi Archmage", 221, Rarity.MYTHIC, mage.cards.k.KasetoOrochiArchmage.class));
        cards.add(new SetCardInfo("Kazandu Tuskcaller", 196, Rarity.RARE, mage.cards.k.KazanduTuskcaller.class));
        cards.add(new SetCardInfo("Key to the City", 248, Rarity.RARE, mage.cards.k.KeyToTheCity.class));
        cards.add(new SetCardInfo("Knight of the White Orchid", 95, Rarity.RARE, mage.cards.k.KnightOfTheWhiteOrchid.class));
        cards.add(new SetCardInfo("Kodama's Reach", 197, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Krosan Grip", 198, Rarity.UNCOMMON, mage.cards.k.KrosanGrip.class));
        cards.add(new SetCardInfo("Living Lore", 121, Rarity.UNCOMMON, mage.cards.l.LivingLore.class));
        cards.add(new SetCardInfo("Llanowar Reborn", 296, Rarity.UNCOMMON, mage.cards.l.LlanowarReborn.class));
        cards.add(new SetCardInfo("Lumbering Falls", 299, Rarity.RARE, mage.cards.l.LumberingFalls.class));
        cards.add(new SetCardInfo("Mage-Ring Network", 300, Rarity.UNCOMMON, mage.cards.m.MageRingNetwork.class));
        cards.add(new SetCardInfo("Magister of Worth", 223, Rarity.RARE, mage.cards.m.MagisterOfWorth.class));
        cards.add(new SetCardInfo("Mana Geyser", 176, Rarity.COMMON, mage.cards.m.ManaGeyser.class));
        cards.add(new SetCardInfo("Managorger Hydra", 199, Rarity.RARE, mage.cards.m.ManagorgerHydra.class));
        cards.add(new SetCardInfo("Martial Impetus", 96, Rarity.UNCOMMON, mage.cards.m.MartialImpetus.class));
        cards.add(new SetCardInfo("Master Biomancer", 224, Rarity.MYTHIC, mage.cards.m.MasterBiomancer.class));
        cards.add(new SetCardInfo("Memorial to Genius", 301, Rarity.UNCOMMON, mage.cards.m.MemorialToGenius.class));
        cards.add(new SetCardInfo("Metallurgic Summonings", 122, Rarity.MYTHIC, mage.cards.m.MetallurgicSummonings.class));
        cards.add(new SetCardInfo("Meteor Golem", 250, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Mikokoro, Center of the Sea", 302, Rarity.RARE, mage.cards.m.MikokoroCenterOfTheSea.class));
        cards.add(new SetCardInfo("Mind Stone", 251, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mind's Desire", 123, Rarity.RARE, mage.cards.m.MindsDesire.class));
        cards.add(new SetCardInfo("Monologue Tax", 19, Rarity.RARE, mage.cards.m.MonologueTax.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 303, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Mycosynth Wellspring", 252, Rarity.COMMON, mage.cards.m.MycosynthWellspring.class));
        cards.add(new SetCardInfo("Myr Battlesphere", 253, Rarity.RARE, mage.cards.m.MyrBattlesphere.class));
        cards.add(new SetCardInfo("Naru Meha, Master Wizard", 124, Rarity.MYTHIC, mage.cards.n.NaruMehaMasterWizard.class));
        cards.add(new SetCardInfo("Necropolis Regent", 147, Rarity.MYTHIC, mage.cards.n.NecropolisRegent.class));
        cards.add(new SetCardInfo("Nissa's Expedition", 200, Rarity.UNCOMMON, mage.cards.n.NissasExpedition.class));
        cards.add(new SetCardInfo("Novijen, Heart of Progress", 305, Rarity.UNCOMMON, mage.cards.n.NovijenHeartOfProgress.class));
        cards.add(new SetCardInfo("Oblation", 97, Rarity.RARE, mage.cards.o.Oblation.class));
        cards.add(new SetCardInfo("Octavia, Living Thesis", 29, Rarity.RARE, mage.cards.o.OctaviaLivingThesis.class));
        cards.add(new SetCardInfo("Oran-Rief, the Vastwood", 307, Rarity.RARE, mage.cards.o.OranRiefTheVastwood.class));
        cards.add(new SetCardInfo("Oreskos Explorer", 98, Rarity.UNCOMMON, mage.cards.o.OreskosExplorer.class));
        cards.add(new SetCardInfo("Orzhov Advokist", 99, Rarity.UNCOMMON, mage.cards.o.OrzhovAdvokist.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 308, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Signet", 254, Rarity.UNCOMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Oversimplify", 72, Rarity.RARE, mage.cards.o.Oversimplify.class));
        cards.add(new SetCardInfo("Paradox Zone", 64, Rarity.RARE, mage.cards.p.ParadoxZone.class));
        cards.add(new SetCardInfo("Parasitic Impetus", 150, Rarity.UNCOMMON, mage.cards.p.ParasiticImpetus.class));
        cards.add(new SetCardInfo("Pendant of Prosperity", 256, Rarity.RARE, mage.cards.p.PendantOfProsperity.class));
        cards.add(new SetCardInfo("Perplexing Test", 30, Rarity.RARE, mage.cards.p.PerplexingTest.class));
        cards.add(new SetCardInfo("Phyrexia's Core", 309, Rarity.UNCOMMON, mage.cards.p.PhyrexiasCore.class));
        cards.add(new SetCardInfo("Pia Nalaar", 177, Rarity.RARE, mage.cards.p.PiaNalaar.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 257, Rarity.COMMON, mage.cards.p.PilgrimsEye.class));
        cards.add(new SetCardInfo("Plaxcaster Frogling", 226, Rarity.UNCOMMON, mage.cards.p.PlaxcasterFrogling.class));
        cards.add(new SetCardInfo("Ponder", 125, Rarity.COMMON, mage.cards.p.Ponder.class));
        cards.add(new SetCardInfo("Primal Empathy", 227, Rarity.UNCOMMON, mage.cards.p.PrimalEmpathy.class));
        cards.add(new SetCardInfo("Pyromancer's Goggles", 259, Rarity.MYTHIC, mage.cards.p.PyromancersGoggles.class));
        cards.add(new SetCardInfo("Quicksmith Genius", 178, Rarity.UNCOMMON, mage.cards.q.QuicksmithGenius.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 203, Rarity.RARE, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Rapid Hybridization", 126, Rarity.UNCOMMON, mage.cards.r.RapidHybridization.class));
        cards.add(new SetCardInfo("Reef Worm", 127, Rarity.RARE, mage.cards.r.ReefWorm.class));
        cards.add(new SetCardInfo("Reinterpret", 73, Rarity.RARE, mage.cards.r.Reinterpret.class));
        cards.add(new SetCardInfo("Reliquary Tower", 311, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Replication Technique", 31, Rarity.RARE, mage.cards.r.ReplicationTechnique.class));
        cards.add(new SetCardInfo("Return of the Wildspeaker", 205, Rarity.RARE, mage.cards.r.ReturnOfTheWildspeaker.class));
        cards.add(new SetCardInfo("Return to Dust", 100, Rarity.UNCOMMON, mage.cards.r.ReturnToDust.class));
        cards.add(new SetCardInfo("Rite of Replication", 128, Rarity.RARE, mage.cards.r.RiteOfReplication.class));
        cards.add(new SetCardInfo("Rousing Refrain", 56, Rarity.RARE, mage.cards.r.RousingRefrain.class));
        cards.add(new SetCardInfo("Rout", 101, Rarity.RARE, mage.cards.r.Rout.class));
        cards.add(new SetCardInfo("Sanctum Gargoyle", 102, Rarity.COMMON, mage.cards.s.SanctumGargoyle.class));
        cards.add(new SetCardInfo("Scavenger Grounds", 314, Rarity.RARE, mage.cards.s.ScavengerGrounds.class));
        cards.add(new SetCardInfo("Scrap Trawler", 260, Rarity.RARE, mage.cards.s.ScrapTrawler.class));
        cards.add(new SetCardInfo("Sculpting Steel", 261, Rarity.RARE, mage.cards.s.SculptingSteel.class));
        cards.add(new SetCardInfo("Seething Song", 179, Rarity.COMMON, mage.cards.s.SeethingSong.class));
        cards.add(new SetCardInfo("Selfless Squire", 103, Rarity.RARE, mage.cards.s.SelflessSquire.class));
        cards.add(new SetCardInfo("Sequence Engine", 67, Rarity.RARE, mage.cards.s.SequenceEngine.class));
        cards.add(new SetCardInfo("Serum Visions", 129, Rarity.UNCOMMON, mage.cards.s.SerumVisions.class));
        cards.add(new SetCardInfo("Shamanic Revelation", 206, Rarity.RARE, mage.cards.s.ShamanicRevelation.class));
        cards.add(new SetCardInfo("Shivan Reef", 316, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 317, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Signet", 262, Rarity.COMMON, mage.cards.s.SimicSignet.class));
        cards.add(new SetCardInfo("Slayers' Stronghold", 318, Rarity.RARE, mage.cards.s.SlayersStronghold.class));
        cards.add(new SetCardInfo("Sol Ring", 263, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 264, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Soul Snare", 104, Rarity.UNCOMMON, mage.cards.s.SoulSnare.class));
        cards.add(new SetCardInfo("Spawning Kraken", 33, Rarity.RARE, mage.cards.s.SpawningKraken.class));
        cards.add(new SetCardInfo("Spectral Searchlight", 265, Rarity.UNCOMMON, mage.cards.s.SpectralSearchlight.class));
        cards.add(new SetCardInfo("Spitting Image", 229, Rarity.RARE, mage.cards.s.SpittingImage.class));
        cards.add(new SetCardInfo("Stalking Leonin", 105, Rarity.RARE, mage.cards.s.StalkingLeonin.class));
        cards.add(new SetCardInfo("Steel Hellkite", 266, Rarity.RARE, mage.cards.s.SteelHellkite.class));
        cards.add(new SetCardInfo("Steel Overseer", 267, Rarity.RARE, mage.cards.s.SteelOverseer.class));
        cards.add(new SetCardInfo("Sun Titan", 106, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sunbird's Invocation", 180, Rarity.RARE, mage.cards.s.SunbirdsInvocation.class));
        cards.add(new SetCardInfo("Sunhome, Fortress of the Legion", 319, Rarity.UNCOMMON, mage.cards.s.SunhomeFortressOfTheLegion.class));
        cards.add(new SetCardInfo("Sunscorch Regent", 107, Rarity.RARE, mage.cards.s.SunscorchRegent.class));
        cards.add(new SetCardInfo("Swarm Intelligence", 130, Rarity.RARE, mage.cards.s.SwarmIntelligence.class));
        cards.add(new SetCardInfo("Tainted Field", 320, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Talisman of Creativity", 269, Rarity.UNCOMMON, mage.cards.t.TalismanOfCreativity.class));
        cards.add(new SetCardInfo("Talrand, Sky Summoner", 131, Rarity.RARE, mage.cards.t.TalrandSkySummoner.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 322, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Mystery", 324, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Silence", 325, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 327, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Terastodon", 207, Rarity.RARE, mage.cards.t.Terastodon.class));
        cards.add(new SetCardInfo("Teysa, Envoy of Ghosts", 230, Rarity.RARE, mage.cards.t.TeysaEnvoyOfGhosts.class));
        cards.add(new SetCardInfo("Thopter Engineer", 181, Rarity.UNCOMMON, mage.cards.t.ThopterEngineer.class));
        cards.add(new SetCardInfo("Thousand-Year Elixir", 271, Rarity.RARE, mage.cards.t.ThousandYearElixir.class));
        cards.add(new SetCardInfo("Together Forever", 108, Rarity.RARE, mage.cards.t.TogetherForever.class));
        cards.add(new SetCardInfo("Tragic Arrogance", 109, Rarity.RARE, mage.cards.t.TragicArrogance.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 408, Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Traumatic Visions", 132, Rarity.COMMON, mage.cards.t.TraumaticVisions.class));
        cards.add(new SetCardInfo("Treasure Cruise", 133, Rarity.COMMON, mage.cards.t.TreasureCruise.class));
        cards.add(new SetCardInfo("Trygon Predator", 231, Rarity.UNCOMMON, mage.cards.t.TrygonPredator.class));
        cards.add(new SetCardInfo("Unstable Obelisk", 272, Rarity.UNCOMMON, mage.cards.u.UnstableObelisk.class));
        cards.add(new SetCardInfo("Utter End", 232, Rarity.RARE, mage.cards.u.UtterEnd.class));
        cards.add(new SetCardInfo("Veyran, Voice of Duality", 3, Rarity.MYTHIC, mage.cards.v.VeyranVoiceOfDuality.class));
        cards.add(new SetCardInfo("Victory Chimes", 274, Rarity.RARE, mage.cards.v.VictoryChimes.class));
        cards.add(new SetCardInfo("Volcanic Vision", 182, Rarity.RARE, mage.cards.v.VolcanicVision.class));
        cards.add(new SetCardInfo("Vow of Duty", 110, Rarity.UNCOMMON, mage.cards.v.VowOfDuty.class));
        cards.add(new SetCardInfo("Wildfire Devils", 183, Rarity.RARE, mage.cards.w.WildfireDevils.class));
        cards.add(new SetCardInfo("Willowdusk, Essence Seer", 6, Rarity.MYTHIC, mage.cards.w.WillowduskEssenceSeer.class));
        cards.add(new SetCardInfo("Windborn Muse", 111, Rarity.RARE, mage.cards.w.WindbornMuse.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 409, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Zetalpa, Primal Dawn", 112, Rarity.RARE, mage.cards.z.ZetalpaPrimalDawn.class));
    }
}
