package me.melonboy10.midi2building;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static me.melonboy10.midi2building.Main.nbt;

public class PlaceBlockEvent extends NoteEvent {

    public PlaceBlockEvent(long tick, Schematic.Location location, SoundAtlas sound) {
        super(tick, location, sound);
    }

    @Override
    public String getFileContents() {
        return null;
    }
//    public boolean makeFunctionFile(String path, long tick, long time) throws IOException {
//        Schematic.Block SchemBlock = schematic.getAndRemoveBlock(block);
//        if (SchemBlock != null) {
//            this.tick = tick;
//
//            File file = new File(path + tick + "-" + SchemBlock.hashCode() + ".mcfunction");
//            file.createNewFile();
//            FileWriter writer = new FileWriter(file);
//            writer.write(String.format("setblock %s %s %s %s", SchemBlock.location.getX(), SchemBlock.location.getY(), SchemBlock.location.getZ(), SchemBlock.getFormat()) + "\n");
//            //writer.write("title @a actionbar [\"\",{\"text\":\"|-=\"},{\"text\":\"" + "\u2b1b".repeat((int) (time / (double) largestTime * 10)) + "\",\"color\":\"aqua\"},{\"text\":\"" + "\u2b1b".repeat((int) (10 - time / (double) largestTime * 10)) + "\",\"color\":\"gray\"},{\"text\":\"=-| \"}]");
//            writer.close();
//            fileName = tick + "-" + SchemBlock.hashCode();
//
//            /*
//            if(SchemBlock.location.getY() == 2 && SchemBlock.location.getX() == 4 && SchemBlock.location.getZ() == 1) {
//                System.out.println(fileName);
//                System.out.println(SchemBlock);
//            }
//            if(block.name().equals("AIR")){
//                System.out.println(SchemBlock.location.getX() + ", " + SchemBlock.location.getY() + ", " + SchemBlock.location.getZ());
//            }*/
//            return true;
//        } else {
//            //System.out.println("!!! Block not found in schematic with block " + block.name() + " !!!");
//        }
//        return false;
//    }
}
