package arc.mirim.service;

import java.util.List;

import arc.mirim.domain.FestivalVO;
import arc.mirim.domain.festivalNumVO;

public interface FestivalService {
	public List<FestivalVO> festivalGetAll();
	public FestivalVO festivalGet(int idx);
	public List<festivalNumVO> festivalTitleGet();
	public void festivalRegister(FestivalVO vo);
	public void festivalRemove(int idx);
	public void festivalModify(FestivalVO vo);
}
