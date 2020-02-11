package sinosoft.com.gof.action.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 封装请假的基本信息
 * @author wangzl
 *
 */

@Data
@AllArgsConstructor
public class LeaveRequest {

	private String empName;
	private int leaveDays;
	private String reason;
}
