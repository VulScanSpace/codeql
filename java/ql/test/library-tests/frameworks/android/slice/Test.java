package generatedtest;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.remotecallback.RemoteCallback;
import androidx.slice.Slice;
import androidx.slice.builders.GridRowBuilder;
import androidx.slice.builders.ListBuilder;
import androidx.slice.builders.SelectionBuilder;
import androidx.slice.builders.SliceAction;

// Test case generated by GenerateFlowTestCase.ql
public class Test {

	Object newWithSlice_actionDefault(Object element) {
		return null;
	}

	Object source() {
		return null;
	}

	void sink(Object o) {}

	public void test() throws Exception {

		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;false;setPrimaryAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.HeaderBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setPrimaryAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setContentDescription;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setContentDescription(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setLayoutDirection;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setLayoutDirection(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setPrimaryAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setPrimaryAction(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setSubtitle(null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setSubtitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setSummary;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setSummary(null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setSummary;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setSummary(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setTitle(null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$HeaderBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.HeaderBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out = in.setTitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;false;addEndItem;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.InputRangeBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.addEndItem(in, false);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;false;addEndItem;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.InputRangeBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.addEndItem(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;false;setInputAction;(PendingIntent);;Argument[0];SyntheticField[androidx.slice.Slice.action]
			// of Argument[-1];taint"
			ListBuilder.InputRangeBuilder out = null;
			PendingIntent in = (PendingIntent) source();
			out.setInputAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;false;setPrimaryAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.InputRangeBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setPrimaryAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.addEndItem(null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.addEndItem(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setContentDescription;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setContentDescription(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setInputAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setInputAction((RemoteCallback) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setInputAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setInputAction((PendingIntent) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setLayoutDirection;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setLayoutDirection(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setMax;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setMax(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setMin;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setMin(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setPrimaryAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setPrimaryAction(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setSubtitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setThumb;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setThumb(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setTitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setTitleItem(null, 0, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setTitleItem(null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$InputRangeBuilder;true;setValue;;;Argument[-1];ReturnValue;value"
			ListBuilder.InputRangeBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out = in.setValue(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;false;setPrimaryAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RangeBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setPrimaryAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setContentDescription;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setContentDescription(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setMax;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setMax(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setMode;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setMode(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setPrimaryAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setPrimaryAction(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setSubtitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setTitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setTitleItem(null, 0, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setTitleItem(null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RangeBuilder;true;setValue;;;Argument[-1];ReturnValue;value"
			ListBuilder.RangeBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out = in.setValue(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;false;setInputAction;(PendingIntent);;Argument[0];SyntheticField[androidx.slice.Slice.action]
			// of Argument[-1];taint"
			ListBuilder.RatingBuilder out = null;
			PendingIntent in = (PendingIntent) source();
			out.setInputAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;false;setPrimaryAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RatingBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setPrimaryAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setContentDescription;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setContentDescription(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setInputAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setInputAction((RemoteCallback) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setInputAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setInputAction((PendingIntent) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setMax;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setMax(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setMin;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setMin(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setPrimaryAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setPrimaryAction(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setSubtitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setTitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setTitleItem(null, 0, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setTitleItem(null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RatingBuilder;true;setValue;;;Argument[-1];ReturnValue;value"
			ListBuilder.RatingBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out = in.setValue(0.0f);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;false;addEndItem;(SliceAction);;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RowBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.addEndItem(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;false;addEndItem;(SliceAction,boolean);;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RowBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.addEndItem(in, false);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;false;setPrimaryAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RowBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setPrimaryAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;false;setTitleItem;(SliceAction);;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RowBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setTitleItem(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;false;setTitleItem;(SliceAction,boolean);;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder.RowBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.setTitleItem(in, false);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.addEndItem(null, 0, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.addEndItem(0L);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.addEndItem((SliceAction) null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.addEndItem((SliceAction) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;addEndItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.addEndItem((IconCompat) null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setContentDescription;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setContentDescription(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setEndOfSection;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setEndOfSection(false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setLayoutDirection;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setLayoutDirection(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setPrimaryAction;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setPrimaryAction(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setSubtitle(null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setSubtitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setSubtitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitle(null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitle;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitle(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitleItem(null, 0, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitleItem(0L);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitleItem((SliceAction) null, false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitleItem((SliceAction) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder$RowBuilder;true;setTitleItem;;;Argument[-1];ReturnValue;value"
			ListBuilder.RowBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out = in.setTitleItem((IconCompat) null, 0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			SliceAction in = (SliceAction) source();
			out.addAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addGridRow;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			GridRowBuilder in = (GridRowBuilder) source();
			out.addGridRow(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addInputRange;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			ListBuilder.InputRangeBuilder in = (ListBuilder.InputRangeBuilder) source();
			out.addInputRange(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addRange;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			ListBuilder.RangeBuilder in = (ListBuilder.RangeBuilder) source();
			out.addRange(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addRating;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			ListBuilder.RatingBuilder in = (ListBuilder.RatingBuilder) source();
			out.addRating(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addRow;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out.addRow(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;addSelection;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			SelectionBuilder in = (SelectionBuilder) source();
			out.addSelection(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;setHeader;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			ListBuilder.HeaderBuilder in = (ListBuilder.HeaderBuilder) source();
			out.setHeader(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;false;setSeeMoreAction;(PendingIntent);;Argument[0];SyntheticField[androidx.slice.Slice.action]
			// of Argument[-1];taint"
			ListBuilder out = null;
			PendingIntent in = (PendingIntent) source();
			out.setSeeMoreAction(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addAction;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addAction(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addGridRow;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addGridRow(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addInputRange;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addInputRange(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addRange;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addRange(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addRating;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addRating(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addRow;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addRow(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;addSelection;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.addSelection(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;build;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[-1];ReturnValue;taint"
			Slice out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.build();
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setAccentColor;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setAccentColor(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setHeader;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setHeader(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setHostExtras;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setHostExtras(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setIsError;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setIsError(false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setKeywords;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setKeywords(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setLayoutDirection;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setLayoutDirection(0);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setSeeMoreAction;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setSeeMoreAction((RemoteCallback) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setSeeMoreAction;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setSeeMoreAction((PendingIntent) null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setSeeMoreRow;;;Argument[-1];ReturnValue;value"
			ListBuilder out = null;
			ListBuilder in = (ListBuilder) source();
			out = in.setSeeMoreRow(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;ListBuilder;true;setSeeMoreRow;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[0];SyntheticField[androidx.slice.Slice.action] of
			// Argument[-1];taint"
			ListBuilder out = null;
			ListBuilder.RowBuilder in = (ListBuilder.RowBuilder) source();
			out.setSeeMoreRow(in);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;SliceAction;false;create;(PendingIntent,IconCompat,int,CharSequence);;Argument[0];SyntheticField[androidx.slice.Slice.action]
			// of ReturnValue;taint"
			SliceAction out = null;
			PendingIntent in = (PendingIntent) source();
			out = SliceAction.create(in, (IconCompat) null, 0, (CharSequence) null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;SliceAction;false;createDeeplink;(PendingIntent,IconCompat,int,CharSequence);;Argument[0];SyntheticField[androidx.slice.Slice.action]
			// of ReturnValue;taint"
			SliceAction out = null;
			PendingIntent in = (PendingIntent) source();
			out = SliceAction.createDeeplink(in, (IconCompat) null, 0, (CharSequence) null);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;SliceAction;false;createToggle;(PendingIntent,CharSequence,boolean);;Argument[0];SyntheticField[androidx.slice.Slice.action]
			// of ReturnValue;taint"
			SliceAction out = null;
			PendingIntent in = (PendingIntent) source();
			out = SliceAction.createToggle(in, (CharSequence) null, false);
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;SliceAction;false;getAction;;;SyntheticField[androidx.slice.Slice.action]
			// of Argument[-1];ReturnValue;taint"
			PendingIntent out = null;
			SliceAction in = (SliceAction) source();
			out = in.getAction();
			sink(out); // $ hasTaintFlow
		}
		{
			// "androidx.slice.builders;SliceAction;true;setChecked;;;Argument[-1];ReturnValue;value"
			SliceAction out = null;
			SliceAction in = (SliceAction) source();
			out = in.setChecked(false);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;SliceAction;true;setContentDescription;;;Argument[-1];ReturnValue;value"
			SliceAction out = null;
			SliceAction in = (SliceAction) source();
			out = in.setContentDescription(null);
			sink(out); // $ hasValueFlow
		}
		{
			// "androidx.slice.builders;SliceAction;true;setPriority;;;Argument[-1];ReturnValue;value"
			SliceAction out = null;
			SliceAction in = (SliceAction) source();
			out = in.setPriority(0);
			sink(out); // $ hasValueFlow
		}

	}

}